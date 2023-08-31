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
        AdidasHylly kaappi = new AdidasHylly();
        Jasper jasper = new Jasper(kaappi);
        jasper.pue();
    }
}
