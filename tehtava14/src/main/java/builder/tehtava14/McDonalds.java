package builder.tehtava14;

import builder.tehtava14.ingredients.BeefPaddy;
import builder.tehtava14.ingredients.Bun;
import builder.tehtava14.ingredients.EggsBenedict;
import builder.tehtava14.ingredients.Lettuce;
import builder.tehtava14.ingredients.Sauce;

/**
 *
 * @author tristan
 */
//Concrete Builder ---> Class implements builder
public class McDonalds implements IBurgerBill {
    
    private BigMac burger;
    
    @Override
    public void buildLettuce() {
        burger.setLettuce(new Lettuce("Lettuce"));
    }
    
    @Override
    public void buildBuns() {
        burger.setBun(new Bun("Brioss"));
    }
    
    @Override
    public void buildBeefPaddy() {
        burger.setBeefPaddy(new BeefPaddy("Black Angus"));
    }
    
    @Override
    public void buildSauce() {
        burger.setSauce(new Sauce("BigMac Sauce"));
    }
    
    @Override
    public void buildEggsBenedict() {
        burger.setEggsBenedict(new EggsBenedict("Eggs benedict"));
    }
    
    @Override
    public void buildNewBurger() {
        this.burger = new BigMac();
    }
    
    @Override
    public Object getBurger() {
        return ((BigMac) burger);
    }
    
}
