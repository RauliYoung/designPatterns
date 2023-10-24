package strategy.tehtava10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author tristan
 */
public class Tehtava10 {

    public static void main(String[] args) {

        Esimies esimies = new Esimies();
        Paallikko paallikko = new Paallikko();
        Toimitusjohtaja toimitusJohtaja = new Toimitusjohtaja();

        esimies.setSuccessor(paallikko);
        paallikko.setSuccessor(toimitusJohtaja);

        try {
            while (true) {
                System.out.println("Monenko prosentin palkkapyyntö käsitellään?");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                esimies.kasittelePalkkaPyynto(new PalkkaPyynto(d));
            }
        } catch (Exception e) {
            System.out.println("Palkkaralli on ohi...");
        }

    }
}
