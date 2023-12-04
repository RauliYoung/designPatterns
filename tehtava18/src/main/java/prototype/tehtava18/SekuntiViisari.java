package prototype.tehtava18;

/**
 *
 * @author tristan
 */
public class SekuntiViisari implements Cloneable {

    private int sekunti;

    @Override
    public SekuntiViisari clone() {
        SekuntiViisari m = null;
        try {
            m = (SekuntiViisari)super.clone();
    
        } catch (Exception e) {
            return null;
        }
        return m;
    }

    public SekuntiViisari() {
        this.sekunti = 0;
    }

    public void increment() {
        this.sekunti++;
    }

    public int getSekunti() {
        return sekunti;
    }

    public void setSekunti(int sekunti) {
        this.sekunti = sekunti;
    }

    @Override
    public String toString() {
        return String.valueOf(sekunti);
    }

}
