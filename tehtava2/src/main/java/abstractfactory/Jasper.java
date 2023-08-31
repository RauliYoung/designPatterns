package abstractfactory;

/**
 *
 * @author tristan
 */
public class Jasper {
    private IVaatekaappi kaappi;
    
    public Jasper(IVaatekaappi kaappi){
        this.kaappi = kaappi;
    }
    
    public void pue(){
        System.out.println(kaappi.pueFarmarit());
        System.out.println(kaappi.pueTpaita());
        System.out.println(kaappi.pueLippis());
        System.out.println(kaappi.pueKengat());
    }
}
