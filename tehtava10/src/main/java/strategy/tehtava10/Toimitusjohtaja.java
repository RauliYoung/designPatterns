package strategy.tehtava10;

/**
 *
 * @author tristan
 */
public class Toimitusjohtaja extends Handler {

    @Override
    public void kasittelePalkkaPyynto(PalkkaPyynto maara) {
        System.out.println( maara.getMaara() + " % " + " on liian suuri palkkapyyntö");
    }

  
}
