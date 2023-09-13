package komponentit;

import java.util.ArrayList;

/**
 *
 * @author tristan
 */
public class Emolevy implements Komponentti{
    
    private double hinta;
    private ArrayList<Komponentti> komponentit = new ArrayList<>();

    public Emolevy(double hinta) {
        this.hinta = hinta;
    }

    
    public void lisaaKomponentti(Komponentti komponentti) {
        komponentit.add(komponentti);
    }
    
    @Override
    public double haeHinta() {
        double kokonaisHinta = hinta;
        for (Komponentti komponentti : komponentit) {
            kokonaisHinta += komponentti.haeHinta();
        }
        return kokonaisHinta;
    }
    
}
