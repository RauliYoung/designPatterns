package prototype.tehtava18;

/**
 *
 * @author tristan
 */
public class MinuuttiViisari implements Cloneable {

    private int minuutti;
    @Override
   public MinuuttiViisari clone() {
        MinuuttiViisari m = null;
        try {
            m = (MinuuttiViisari)super.clone();
    
        } catch (Exception e) {
            return null;
        }
        return m;
    }
    public MinuuttiViisari() {
        this.minuutti = 0;
    }

    public void increment() {
        this.minuutti++;
    }

    public int getMinuutti() {
        return minuutti;
    }

    public void setMinuutti(int minuutti) {
        this.minuutti = minuutti;
    }

    @Override
    public String toString() {
        return String.valueOf(minuutti);
    }

}
