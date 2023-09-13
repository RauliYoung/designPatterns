package komponentit;

/**
 *
 * @author tristan
 */
public class Prosessori implements Komponentti{
    private double hinta;

    public Prosessori(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public double haeHinta() {
        return this.hinta;
    }
    
}
