package com.maven.template.tehtava8;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tristan
 */
public class Monopoly extends Game {

    private Scanner lukija = new Scanner(System.in);
    private int currentPlayer;
    private int noppa;
    private int[][] playerPositions;
    private int boardSize = 100;

    @Override
    void initializeGame() {
        System.out.println("Welcome to monopoly mister, win or lose all youre money!");
        playerPositions = new int[playersCount][boardSize];
        currentPlayer = 0;
        for (int i = 0; i < playersCount; i++) {
            playerPositions[i] = new int[boardSize];
            Arrays.fill(playerPositions[i], 0);
        }
        System.out.println("Odotellaan jännittyneenä lähtölaukausta....");
        while (true) {
            tulostaToiminnot();
            System.out.print(">");
            String syote = lukija.nextLine();
            if (syote.equalsIgnoreCase("0")) {
                endOfGame();
                break;
            }
            kasitteleKomento(syote);
            System.out.println("");
        }
    }

    @Override
    void makePlay(int player) {
        System.out.println("THIS IS THE PLAYER" + player);
        //Tee taulukko tai lista mikä tulostaa yhtä monta rataa kuin on pelaajaa
        //pelaajat heittelevät vuorollansa noppaa jolloin pelaaja liikkuu heitetyn määrän eteenpäin laudalla.
        playerPositions[player][currentPlayer] = Math.min(boardSize - 1, playerPositions[player][currentPlayer] + noppa);
        displayBoard();
        //neljännen pelaajan kohdalla ongelma, tarkista indeksit että osaa päivittää nekin nollaksi. Positiot myös nollautuvat joka kierroksella, ei toivottavaa.
        if(currentPlayer == playersCount) {
            currentPlayer = 0;
        }else {
            currentPlayer++;
        }
    }

    @Override
    boolean endOfGame() {
        return true;
    }

    @Override
    void printWinner() {

    }

    public void tulostaToiminnot() {
        System.out.println("0. Lopettaa..");
        System.out.println("1. Heitä noppaa..");
    }

    public void kasitteleKomento(String input) {

        if (input.equalsIgnoreCase("0")) {
            System.out.println("Johan on markkinat");

        }
        if (input.equalsIgnoreCase("1")) {
            noppa = heitaNoppaa();
            System.out.println(currentPlayer + " heittää noppaa ja saa luvuksi " + noppa);
            makePlay(currentPlayer);
        }

    }

    private int heitaNoppaa() {
        return (int) (Math.random() * 6 + 1);
    }

    private void displayBoard() {
        // Display the positions of each player on their respective tracks
        for (int player = 0; player < playersCount; player++) {
            System.out.println("Rata numero " + (player + 1));
            for (int i = 0; i < boardSize; i++) {
                if (i == playerPositions[player][currentPlayer]) {
                    System.out.print("|" + (player + 1));
                } else {
                    System.out.print("|-");
                }
            }
            System.out.println("|Goal");
        }
    }

}
