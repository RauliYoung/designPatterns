/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package abstractfactorysingleton.tehtava5;

import nuuskaTehdas.Nuuskatehdas;
import nuuskaTehdas.ITehdas;
import nuuskat.INuuska;

/**
 *
 * @author tristan
 */
public class Tehtava5 {

    public static void main(String[] args) {
        ITehdas nuuskatehdas = Nuuskatehdas.getInstance();
        ITehdas nuuskis = Nuuskatehdas.getInstance();
        INuuska ettan = nuuskis.luoNuuska("Ettan", 3);
        INuuska general = nuuskatehdas.luoNuuska("General", 5);
        System.out.println(general.toString());
        System.out.println(ettan.toString());
    }
}
