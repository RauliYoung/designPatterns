package com.maven.template.tehtava8;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tristan
 */
public class Pinko extends Game {

    private Scanner lukija = new Scanner(System.in);
    private int currentPlayer;
    private int noppa;
    private int[][] playerPositions;
    private int radanPituus = 10;

    @Override
    void initializeGame() {
        System.out.println("Welcome to monopoly mister, win or lose all youre money!");
        playerPositions = new int[playersCount][radanPituus];
        currentPlayer = 0;
        for (int i = 0; i < playersCount; i++) {
            playerPositions[i] = new int[radanPituus];
            Arrays.fill(playerPositions[i], 0);
        }
        System.out.println("Odotellaan jännittyneenä lähtölaukausta....");
        while (true) {
            System.out.flush();
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
        int newPosition = Math.min(radanPituus - 1, playerPositions[player][currentPlayer] + noppa);
        if (newPosition == radanPituus - 1) {
            System.out.println("Pelaaja numero " + (player + 1) + " on saavuttanut maaliviivan!.");
            displayBoard();
            endOfGame();
            resetGame();
            return;
        }
        playerPositions[player][currentPlayer] = newPosition;
        System.out.flush();
        displayBoard();
        currentPlayer++;
        if (currentPlayer == playersCount) {
            currentPlayer = 0;
        }
    }
    
     private void resetGame() {
        currentPlayer = 0;
        for (int i = 0; i < playersCount; i++) {
            Arrays.fill(playerPositions[i], 0);
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
        System.out.println("Tervetuloa Pinko pikajuoksupeliin!");
        System.out.println("1. Laukaise Startti pistooli!");
        System.out.println("2. Valitse matka metreissä.");
        System.out.println("3. Valitse pelaajien määrä.");
        System.out.println("0. Lopettaa..");
    }

    public void kasitteleKomento(String input) {

        if (input.equalsIgnoreCase("0")) {
            System.out.println("Johan on markkinat, eikö urheilu maistu????");
        }
        if (input.equalsIgnoreCase("1")) {
            noppa = heitaNoppaa();
            makePlay(currentPlayer);
        }
        if(input.equalsIgnoreCase("2")) {
            int pituus;
            System.out.println("Anna radan pituus!");
            try {
                pituus = lukija.nextInt();
                if(pituus > 400 || pituus < 60 ) {
                    System.out.println("Pituus vähintään 60m ja enintään 400m, oletuksena 100m. ");
                }
                setRadanPituus(pituus);
            } catch (Exception e) {
                System.out.println("Ikävä kyllä tapahtui virhe...");
            }
            
        }
        if(input.equalsIgnoreCase("3"))  {
            int pelaajienLkm;
            System.out.println("Anna pelaajien määrä..");
            try {
                pelaajienLkm = lukija.nextInt();
                if(pelaajienLkm < 1 || pelaajienLkm > 5) {
                    System.out.println("Vähintään yksi, enintään 5 pelaajaa.");
                }
                setPlayersCount(pelaajienLkm);
                initializeGame();
            } catch (Exception e) {
            }
        }

    }

    public void setPlayersCount(int playersCount) {
        this.playersCount = playersCount;
    }
    
    
    
    public void setRadanPituus(int radanPituus) {
        this.radanPituus = radanPituus;
    }

    private int heitaNoppaa() {
        return (int) (Math.random() * 6 + 1);
    }

    private void displayBoard() {
        System.out.flush();
        for (int player = 0; player < playersCount; player++) {
            System.out.println("Rata numero " + (player + 1));
            for (int i = 0; i < radanPituus; i++) {
                if (i == radanPituus - 1) {
                    System.out.print("|Goal");
                } else {
                    boolean playerHere = false;
                    for (int p = 0; p < playersCount; p++) {
                        if (i == playerPositions[p][player]) {
                            if (i != 0) {
                                System.out.print("|" + "@");
                            } else {
                                System.out.print("|-");
                            }
                            playerHere = true;
                            break;
                        }
                    }
                    if (!playerHere && i != 0) {
                        System.out.print("|-");
                    }
                }
            }
            System.out.println();
        }
    }
}
