package builder.tehtava14;

/**
 *
 * @author tristan
 */

// Builder --> Interface

public interface IBurgerBill {
    
    public abstract void buildNewBurger();

    public abstract void buildLettuce();

    public abstract void buildBuns();

    public abstract void buildBeefPaddy();

    public abstract void buildSauce();

    public abstract void buildEggsBenedict();
    
    public abstract Object getBurger();
}


/*
public abstract void createNewPizzaProduct();
public abstract void buildDough();
public abstract void buildSauce();
public abstract void buildTopping();
public abstract Object getPizza();
// voidaan määritellä toteuttavaan luokkaan palauttamaan
// oikean tyyppinen pizza
*/