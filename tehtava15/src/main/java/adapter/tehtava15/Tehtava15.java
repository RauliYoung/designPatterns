/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package adapter.tehtava15;

/**
 *
 * @author tristan
 */
public class Tehtava15 {

    public static void main(String[] args) {
        PistokeAdapteri muuntaja = new PistokeOlioAdapteriPalikka();
        Voltti v12 = muuntaja.get12Volttia();
        Voltti v5 = muuntaja.get5Volttia();
        System.out.println("v5 voltit käyttäen muuntajaa " + v5.getVoltit());
        System.out.println("v12 voltit käyttäen muuntajaa " + v12.getVoltit());
    }
    
  
} 
