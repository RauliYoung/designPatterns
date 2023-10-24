package strategy.tehtava10;

/**
 *
 * @author tristan
 */
public class Esimies extends Handler {

    @Override
    public void kasittelePalkkaPyynto(PalkkaPyynto maara) {
        if (maara.getMaara() <= 2) {
            System.out.println("Esimies hyväksyy maksimissaan " + maara.getMaara() + " % Palkankorotukset...");
        } else {
            System.out.println(" Palkankorotus siirtyy seuraavalle käsittelijälle...");
            super.kasittelePalkkaPyynto(maara);
        }
    }

}
