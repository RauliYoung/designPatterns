package com.composite.tehtava3;

import komponentit.Emolevy;
import komponentit.Naytonohjain;
import komponentit.Prosessori;
import komponentit.Virtalahde;
import kotelo.Kotelo;

/**
 *
 * @author rauliyoung
 */
public class Tehtava3 {

    public static void main(String[] args) {
        Kotelo kotelo = new Kotelo(80);
        Emolevy asRock = new Emolevy(55);
        Prosessori amd = new Prosessori(455);
        Naytonohjain nVidia = new Naytonohjain(1200);
        Virtalahde gold = new Virtalahde(224.4);
        
        
        asRock.lisaaKomponentti(nVidia);
        asRock.lisaaKomponentti(amd);
        kotelo.lisaaKomponentti(asRock);
        kotelo.lisaaKomponentti(gold);
        
        System.out.println("Koko koneen hinta on: " + kotelo.haeHinta() + " euroa.");
        
    }
}
