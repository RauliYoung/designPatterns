/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package abstractfactory;

/**
 *
 * @author tristan
 */
public class Tehtava2 {

    public static void main(String[] args) {
        HugoHylly parempaaSeppalaa;
        AdidasHylly kaappi = new AdidasHylly();
        Jasper jasper = new Jasper(kaappi);
        jasper.pue();
        jasper.setValmistunut(true);
        if(jasper.isValmistunut() == true) {
            System.out.println("");
            parempaaSeppalaa = new HugoHylly();
            jasper.setKaappi(parempaaSeppalaa);
            jasper.pue();
        }
        
    }
}
