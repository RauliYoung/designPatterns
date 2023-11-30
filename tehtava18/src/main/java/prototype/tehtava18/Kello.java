package prototype.tehtava18;

import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tristan
 */
public class Kello extends Thread implements Cloneable {

    private TuntiViisari tunti;
    private MinuuttiViisari minuutti;
    private SekuntiViisari sekunti;

    public Kello() {
        this.minuutti = new MinuuttiViisari();
        this.tunti = new TuntiViisari();
        this.sekunti = new SekuntiViisari();
    }

    public TuntiViisari getTunti() {
        return tunti;
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

        while (true) {
            System.out.println("\r" + Thread.currentThread().toString());
            sekunti.increment();
            if (sekunti.getSekunti() == 60) {
                minuutti.increment();
                sekunti.setSekunti(1);
            }
            if (minuutti.getMinuutti() == 60) {
                tunti.increment();
                minuutti.setMinuutti(1);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Kello.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public String toString() {
        return "[" + tunti + ":" + minuutti + ":" + sekunti + ']';
    }

}

//            try {
//                if (System.in.available() > 0 && input.nextLine().equals("")) {
//                    Thread.currentThread().
//                    System.out.println("Enter key pressed!");
//                }
//            } catch (IOException ex) {
//                Logger.getLogger(Kello.class.getName()).log(Level.SEVERE, null, ex);
//            }
