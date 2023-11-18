package builder.tehtava14;

import builder.tehtava14.ingredients.BeefPaddy;
import builder.tehtava14.ingredients.Bun;
import builder.tehtava14.ingredients.EggsBenedict;
import builder.tehtava14.ingredients.Lettuce;
import builder.tehtava14.ingredients.Sauce;
import java.util.ArrayList;

/**
 *
 * @author tristan
 */
public class BigMac {
    
    private ArrayList<Object> ingredients = new ArrayList<>();
    //Jätin nää tänne ku tein ensin ilman lista...
    private Bun bun;
    private Lettuce lettuce;
    private Sauce sauce;
    private BeefPaddy paddy;
    private EggsBenedict eggs;

    public void setBun(Bun bun) {
        ingredients.add(bun);
        this.bun = bun;
    }

    public void setLettuce(Lettuce lettuce) {
        ingredients.add(lettuce);
        this.lettuce = lettuce;
    }

    public void setSauce(Sauce sauce) {
        ingredients.add(bun);
        this.sauce = sauce;
    }

    public void setBeefPaddy(BeefPaddy beef) {
        ingredients.add(beef);
        this.paddy = beef;
    }

    public void setEggsBenedict(EggsBenedict eggs) {
        ingredients.add(eggs);
        this.eggs = eggs;
    }
    //Rehellisesti laiskistuin enkä jaksanut enää muotoilla näitä to stringeja
    @Override
    public String toString() {
        return "BigMac{" + "ingredients=" + ingredients + ", bun=" + bun + ", lettuce=" + lettuce + ", sauce=" + sauce + ", paddy=" + paddy + ", eggs=" + eggs + '}';
    }


}
