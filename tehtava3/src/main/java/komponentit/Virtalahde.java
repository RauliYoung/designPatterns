
package komponentit;

/**
 *
 * @author tristan
 */
public class Virtalahde implements Komponentti{
    private double hinta;

    public Virtalahde() {
    }

    public Virtalahde(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public double haeHinta() {
        return this.hinta;
    }
    
    
}
