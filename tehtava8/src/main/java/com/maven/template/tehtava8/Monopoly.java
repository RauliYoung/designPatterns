package com.maven.template.tehtava8;

import java.util.Scanner;

/**
 *
 * @author tristan
 */
public class Monopoly extends Game {

    private Scanner lukija = new Scanner(System.in);

    @Override
    void initializeGame() {
        System.out.println("Welcome to monopoly mister, win or lose all youre money!");
        while (true) {
            tulostaToiminnot();
            System.out.print(">");
            String syote = lukija.nextLine();
            if(syote.equalsIgnoreCase("0")) {
                endOfGame();
                break;
            }
            kasitteleKomento(syote);
            System.out.println("");
            
        }
    }

    @Override
    void makePlay(int player) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    boolean endOfGame() {
        return true;
    }

    @Override
    void printWinner() {
        System.out.println("Weee have a winner!");
    }

    public void tulostaToiminnot() {
        System.out.println("0. Lopettaa");
    }

    public void kasitteleKomento(String input) {
        System.out.println("onko");
        if (input.equalsIgnoreCase("0")) {
            System.out.println("Johan on markkinat");
            
        }
    }

}
