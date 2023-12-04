package prototype.tehtava18;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tristan
 */
public class Tehtava18 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Kello kello = new Kello("Käkikello");

        

        Kello kello2 = kello.clone();
        
        kello2.setKelloTyyppi("Digikello");
        
        
        
       do {
           kello.run();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tehtava18.class.getName()).log(Level.SEVERE, null, ex);
            }
           kello2.run();
       }while (kello2.getSekunti().getSekunti() < 15);
        System.out.println(kello + " Kello 1");
        System.out.println(kello2 + " kello 2");

    }
}
