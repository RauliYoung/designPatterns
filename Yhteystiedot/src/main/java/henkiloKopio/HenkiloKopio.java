/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package henkiloKopio;

import java.util.Scanner;

/**
 *
 * @author tristan
 */
public class HenkiloKopio {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
//        new YhteystietoArkisto(lukija).kaynnista();

        Henkilo mikko = new Henkilo("Mikko", 21, "Osta kirja");
        Henkilo anneli = null;
        System.out.println(mikko);
        try {
            mikko.clone();
            anneli = (Henkilo) mikko.clone();
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
        }

        System.out.println(anneli);
        anneli.setNimi("Anneli");
        anneli.setIka(21);
        System.out.println(anneli); 

    }
}
