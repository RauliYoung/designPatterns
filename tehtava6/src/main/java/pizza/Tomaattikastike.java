/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizza;

/**
 *
 * @author rauliyoung
 */
public class Tomaattikastike extends Pizzatayte{
    public Tomaattikastike(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getHinta() {
        return pizza.getHinta() + 0.5;
    }

    @Override
    public String getKuvaus() {
        return pizza.getKuvaus() + " Tomaattikastike";
    }
}
