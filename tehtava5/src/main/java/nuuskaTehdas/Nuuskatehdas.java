/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuuskaTehdas;

import nuuskat.INuuska;
import nuuskat.Nuuska;

/**
 *
 * @author tristan
 */
public class Nuuskatehdas implements ITehdas{
    
    private static Nuuskatehdas INSTANCE = null;
    
    private Nuuskatehdas() {}
    
        public static Nuuskatehdas getInstance() {
            if(INSTANCE == null) {
                INSTANCE = new Nuuskatehdas();
            }
            return INSTANCE;
        }
    

    @Override
    public INuuska luoNuuska(String merkki, int vahvuus) {
        return new Nuuska (merkki,vahvuus);
    }
    
   
    
}
