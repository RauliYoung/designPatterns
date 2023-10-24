package strategy.tehtava10;

/**
 *
 * @author tristan
 */
public class Paallikko extends Handler {

    @Override
    public void kasittelePalkkaPyynto(PalkkaPyynto maara) {
        if (maara.getMaara() > 2 && maara.getMaara() < 5) {
            System.out.println("Päällikkö hyväksyy " + maara.getMaara() + " % Palkankorotukset...");
        } else {
             System.out.println("Nyt ei nappulat riitä, seuraava käsittelijä.....");
            super.kasittelePalkkaPyynto(maara);
        }
    }

}
