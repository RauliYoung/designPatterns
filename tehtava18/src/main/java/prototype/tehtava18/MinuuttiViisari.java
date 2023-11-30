package prototype.tehtava18;

/**
 *
 * @author tristan
 */
public class MinuuttiViisari {

    private int minuutti;

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
