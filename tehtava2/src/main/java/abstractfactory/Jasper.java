package abstractfactory;

/**
 *
 * @author tristan
 */
public class Jasper {
    private IVaatekaappi kaappi;
    private boolean valmistunut = false;
    
    public Jasper(IVaatekaappi kaappi){
        this.kaappi = kaappi;
    }
    
    public void pue(){
        System.out.println(kaappi.pueFarmarit());
        System.out.println(kaappi.pueTpaita());
        System.out.println(kaappi.pueLippis());
        System.out.println(kaappi.pueKengat());
    }

    public boolean isValmistunut() {
        return valmistunut;
    }

    public void setValmistunut(boolean valmistunut) {
        this.valmistunut = valmistunut;
    }

    public void setKaappi(IVaatekaappi kaappi) {
        this.kaappi = kaappi;
    }
    
    
    
    
}
