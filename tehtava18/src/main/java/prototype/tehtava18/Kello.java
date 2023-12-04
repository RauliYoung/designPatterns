package prototype.tehtava18;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tristan
 */
public class Kello implements Cloneable {

    private String kelloTyyppi;
    private TuntiViisari tunti;
    private MinuuttiViisari minuutti;
    private SekuntiViisari sekunti;
    private boolean kay;

    public Kello() {
        super();
        this.minuutti = new MinuuttiViisari();
        this.tunti = new TuntiViisari();
        this.sekunti = new SekuntiViisari();
        this.kay = false;
    }

    public Kello(String kelloTyyppi) {
        super();
        this.kelloTyyppi = kelloTyyppi;
        this.minuutti = new MinuuttiViisari();
        this.tunti = new TuntiViisari();
        this.sekunti = new SekuntiViisari();
    }

    @Override
    public Kello clone() {
        Kello clone = null;
        try {
            clone = (Kello) super.clone();
            clone.sekunti = (SekuntiViisari) sekunti.clone();
            clone.minuutti = (MinuuttiViisari) minuutti.clone();
            clone.tunti = (TuntiViisari) tunti.clone();

        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
            return null;
        }
        return clone;
    }

    public TuntiViisari getTunti() {
        return tunti;
    }

    public void setKelloTyyppi(String kelloTyyppi) {
        this.kelloTyyppi = kelloTyyppi;
    }

    public void setTunti(TuntiViisari tunti) {
        this.tunti = tunti;
    }

    public MinuuttiViisari getMinuutti() {
        return minuutti;
    }

    public void setMinuutti(MinuuttiViisari minuutti) {
        this.minuutti = minuutti;
    }

    public SekuntiViisari getSekunti() {
        return sekunti;
    }

    public void setSekunti(SekuntiViisari sekunti) {
        this.sekunti = sekunti;
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        kay = true;
        while (kay) {
            System.out.println("\r" + this.toString());
            sekunti.increment();
            if (sekunti.getSekunti() == 60) {
                minuutti.increment();
                sekunti.setSekunti(1);
            }
            if (minuutti.getMinuutti() == 60) {
                tunti.increment();
                minuutti.setMinuutti(1);
            }
            if (tunti.getTunti() == 24) {
                tunti.setTunti(1);
            }
            if (input.hasNextLine()) {
                String userInput = input.nextLine();
                if ("stop".equals(userInput)) {
                    kay = false;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Kello.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public String toString() {
        return kelloTyyppi + "\n" + "[" + tunti + ":" + minuutti + ":" + sekunti + ']';
    }

}
