/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizza;

/**
 *
 * @author rauliyoung
 */
public class Juusto extends Pizzatayte {
    public Juusto(Pizza pizza) {
        super(pizza);
    }
    @Override
    public double getHinta() {
        return pizza.getHinta() + 1.5;
    }

    @Override
    public String getKuvaus() {
        return pizza.getKuvaus() + " juustoraaste";
    }
    
}
