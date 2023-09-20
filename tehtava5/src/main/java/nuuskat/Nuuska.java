package nuuskat;

/**
 *
 * @author tristan
 */
public class Nuuska implements INuuska{
    
    private String nimi;
    private int vahvuus;

    public Nuuska(String nimi, int vahvuus) {
        this.nimi = nimi;
        this.vahvuus = vahvuus;
    }
    

    @Override
    public String toString() {
        return "Hyvää " + nimi + "i:a " + "jonka vahvuus on " + vahvuus + " mg/pussi.";
    }
    
    
}
