
package pizza;

/**
 *
 * @author rauliyoung
 */
public class Pizzapohja implements Pizza {

    @Override
    public double getHinta() {
        return 5.0;
    }

    @Override
    public String getKuvaus() {
        return "Pohjan päällä on";
    }
    
}
