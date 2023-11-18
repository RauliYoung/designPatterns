package builder.tehtava14;

/**
 *
 * @author tristan
 */
//Concrete Builder ---> Class implements builder
public class Hesburger implements IBurgerBill {
    
    private Kerroshampurilainen hamppari;
    

    @Override
    public void buildLettuce() {
        hamppari.setLettuce("Jäävuorisalaatti");
    }

    @Override
    public void buildBuns() {
        hamppari.setBun("Hampurilais sämpylä");
    }

    @Override
    public void buildBeefPaddy() {
        hamppari.setBeefPaddy("Naudanliha Pihvi");
    }

    @Override
    public void buildSauce() {
        hamppari.setSauce("Paprika majoneesi");
    }

    @Override
    public void buildEggsBenedict() {
       hamppari.setEggsBenedict("Uppomuna");
    }

    @Override
    public void buildNewBurger() {
        this.hamppari = new Kerroshampurilainen();
        System.out.println(this.hamppari);
    }

    @Override
    public Object getBurger() {
        return ((Kerroshampurilainen)hamppari);
    }
    
}
