package komponentit;

/**
 *
 * @author tristan
 */
public class Naytonohjain implements Komponentti{
    private double hinta;

    public Naytonohjain(double hinta) {
        this.hinta = hinta;
    }
    
    @Override
    public double haeHinta() {
       return this.hinta;
    }
    
    
}
