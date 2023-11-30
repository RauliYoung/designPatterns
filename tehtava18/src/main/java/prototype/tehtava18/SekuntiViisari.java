package prototype.tehtava18;

/**
 *
 * @author tristan
 */
public class SekuntiViisari {

    private int sekunti;

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
