package com.maven.template.tehtava8;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.gui2.TextBox;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pinko extends Game {

    private TextGraphics textGraphics;
    private Terminal terminal;
    private Screen screen;
    private TextBox inputTextBox;  // Added input text box
    private TextBox progressHolder;  // Added progress holder
    private Scanner scanner = new Scanner(System.in);
    private int currentPlayer;
    private int diceValue;
    private int[][] playerPositions;
    private int trackLength = 60;

    public Pinko() throws IOException {
        this.terminal = new DefaultTerminalFactory().createTerminal();
        this.screen = new TerminalScreen(terminal);
        this.textGraphics = screen.newTextGraphics();
        
        
    }

    @Override
    boolean endOfGame() {
        return true;
    }

    @Override
    void printWinner() {
        //screen.clear();
        String voittaja = Integer.toString(currentPlayer);
        textGraphics.putCSIStyledString(5, 10, "Voittaja on " + voittaja );
    }

    @Override
    void initializeGame() {
        boolean isRunning = true;
        playerPositions = new int[playersCount][trackLength];
        currentPlayer = 0;
        for (int i = 0; i < playersCount; i++) {
            playerPositions[i] = new int[trackLength];
            Arrays.fill(playerPositions[i], 0);
        }

        try {
            screen.startScreen();
        } catch (IOException ex) {
            Logger.getLogger(Pinko.class.getName()).log(Level.SEVERE, null, ex);
        }
        screen.clear();
        displayInstructions();


        while (isRunning) {
            String input = getUserInput();
            handleInput(input);
            if (input.equalsIgnoreCase("q")) {
                isRunning = false;
            }
        }

        closeScreen();
    }

    private void resetGame() {
        currentPlayer = 0;
        for (int i = 0; i < playersCount; i++) {
            Arrays.fill(playerPositions[i], 0);
        }
    }

    @Override
    void makePlay(int player) {
        int newPosition = Math.min(trackLength - 1, playerPositions[player][currentPlayer] + diceValue);
        if (newPosition == trackLength - 1) {
            displayBoard();
            printWinner();
            endOfGame();
            resetGame();
            return;
        }
        playerPositions[player][currentPlayer] = newPosition;
        displayBoard();
        currentPlayer = (currentPlayer + 1) % playersCount;
    }

    private void handleInput(String input) {
        switch (input) {
            case "1":
                diceValue = rollDice();
                makePlay(currentPlayer);
                break;
            case "2":
                setTrackLength();
                break;
            case "3":
                setPlayersCount();
                break;
            default:
                textGraphics.putString(1, 8, "Hutera valinta, kokeile uudestaan..");
                break;
        }
        refreshScreen();
    }

    private void setPlayersCount() {
        textGraphics.putString(1, 8, "Syötä pelaajien määrä: ");
        refreshScreen();
        try {
            playersCount = Integer.parseInt(getUserInput().trim());
            if (playersCount < 1 || playersCount > 5) {
                textGraphics.putString(1, 9, "Pelaajien lukumäärän tulee olla 1 ja viiden väliltä, oletuksena 2.");
                playersCount = 2;
            }
        } catch (NumberFormatException e) {
            textGraphics.putString(1, 9, "Väärä valinta kilpailijoiden lukumäärä 2.");
            playersCount = 2;
        }
        refreshScreen();
    }

    // other methods
    public void displayInstructions() {
        textGraphics.putString(1, 1, "Tervetuloa Pinko pikajuoksupeliin!");
        textGraphics.putString(1, 3, "1. Laita pojat juoksemaan.");
        textGraphics.putString(1, 4, "2. Valitse matka metreissä.");
        textGraphics.putString(1, 5, "3. Aseta pelaajien lukumäärä.");
        textGraphics.putString(1, 6, "q. Lopeta.");
        refreshScreen();
    }

    private int rollDice() {
        return (int) (Math.random() * 6 + 1);
    }

    private void setTrackLength() {
        textGraphics.putString(1, 8, "Enter the track length: ");
        refreshScreen();
        try {
            trackLength = Integer.parseInt(getUserInput().trim());
            if (trackLength < 60 || trackLength > 400) {
                textGraphics.putString(1, 9, "Radan pituuden tulee olla 60 - 400 metriä. Oletusarvo on 60 metriä.");
                trackLength = 60;
            }
        } catch (NumberFormatException e) {
            textGraphics.putString(1, 9, "Väärä syöte, oletus on 60metriä.");
            trackLength = 60;
        }
        refreshScreen();
    }

    private void closeScreen() {
        try {
            screen.stopScreen();
            terminal.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void clearScreen() {
        screen.clear();
    }

    private void refreshScreen() {
        try {
            screen.refresh();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // other methods
    private String getUserInput() {
        try {
            KeyStroke keyStroke = screen.readInput();
            return keyStroke == null ? "" : String.valueOf(keyStroke.getCharacter());
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    private void displayBoard() {
        try {
            screen.clear();
            char goalCharacter = '|';
            char playerCharacter = '@';
            for (int player = 0; player < playersCount; player++) {
                textGraphics.putString(0, player, "Track " + (player + 1));
                for (int i = 0; i < trackLength; i++) {
                    if (i == trackLength - 1) {
                        screen.setCharacter(i, player, new TextCharacter(goalCharacter));
                    } else {
                        boolean playerHere = false;
                        for (int p = 0; p < playersCount; p++) {
                            if (i == playerPositions[p][player]) {
                                screen.setCharacter(i, player, new TextCharacter(playerCharacter));
                                playerHere = true;
                                break;
                            }
                        }
                        if (!playerHere && i != 0) {
                            screen.setCharacter(i, player, new TextCharacter('-'));
                        }
                    }
                }
            }
            screen.refresh();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
