/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komponentit;

/**
 *
 * @author tristan
 */
public class Keskuskmuisti implements Komponentti{
    private double hinta;

    public Keskuskmuisti(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public double haeHinta() {
        return this.hinta;
    }
    
    
}
