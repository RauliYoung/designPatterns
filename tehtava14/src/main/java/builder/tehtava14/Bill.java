package builder.tehtava14;

/**
 *
 * @author rauliyoung
 */
public class Bill {

    private IBurgerBill burgerBuilder;

    public void setBurgerBill(IBurgerBill burgerBill) {
        burgerBuilder = burgerBill;
    }

    public void buildBurger() {
        burgerBuilder.buildNewBurger();
        burgerBuilder.buildBuns();
        burgerBuilder.buildBeefPaddy();
        burgerBuilder.buildEggsBenedict();
        burgerBuilder.buildLettuce();
        burgerBuilder.buildSauce();
    }
}
