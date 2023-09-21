package pizza;

import pizza.Pizzatayte;

/**
 *
 * @author rauliyoung
 */
public class Kinkkusuikale extends Pizzatayte {

    public Kinkkusuikale(Pizza pizza) {
        super(pizza);
    }
    
    @Override
    public double getHinta() {
        return pizza.getHinta() + 2.5;
    }

    @Override
    public String getKuvaus() {
        return pizza.getKuvaus() + " kinkkusuikale";
    }
    
}
