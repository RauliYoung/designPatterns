package com.composite.tehtava3;

import komponentit.Emolevy;
import kotelo.Kotelo;

/**
 *
 * @author rauliyoung
 */
public class Tehtava3 {

    public static void main(String[] args) {
        Kotelo kotelo = new Kotelo(80);
        Emolevy assRock = new Emolevy(55);
        
        kotelo.lisaaKomponentti(assRock);
        
        System.out.println("Koko koneen hinta on: " + kotelo.haeHinta());
        
    }
}
