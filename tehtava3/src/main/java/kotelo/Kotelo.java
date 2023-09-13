package kotelo;

import java.util.ArrayList;
import komponentit.Komponentti;

/**
 *
 * @author tristan
 */
public class Kotelo implements Komponentti{
    private double hinta;
    private ArrayList<Komponentti> komponentit = new ArrayList<>();

    public Kotelo(double hinta) {
        this.hinta = hinta;
    }
    
    public void lisaaKomponentti(Komponentti komponentti) {
        komponentit.add(komponentti);
    }
    
    @Override
    public double haeHinta() {
        double kokonaisHinta = hinta;
        for(Komponentti komponentti: komponentit) {
            kokonaisHinta += komponentti.haeHinta();
        }
        return kokonaisHinta;
    }
}
