package prototype.tehtava18;

/**
 *
 * @author tristan
 */
public class TuntiViisari {

    private int tunti;

    public TuntiViisari() {
        this.tunti = 0;
    }

    public void increment() {
        this.tunti++;
    }

    public int getTunti() {
        return tunti;
    }

    public void setTunti(int tunti) {
        this.tunti = tunti;
    }

    @Override
    public String toString() {
        return String.valueOf(tunti);
    }

}
