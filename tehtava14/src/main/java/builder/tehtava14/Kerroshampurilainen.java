package builder.tehtava14;

/**
 *
 * @author tristan
 */
public class Kerroshampurilainen {

    private StringBuilder ingredients = new StringBuilder();

    public void setBun(String bun) {
        ingredients.append(bun).append(", ");
    }

    public void setLettuce(String lettuce) {
        ingredients.append(lettuce).append(", ");
    }

    public void setSauce(String sauce) {
        ingredients.append(sauce);
    }

    public void setEggsBenedict(String eggs) {
        ingredients.append(eggs).append(", ");
    }

    public void setBeefPaddy(String beefPaddy) {
        ingredients.append(beefPaddy).append(", ");
    }

    @Override
    public String toString() {
        return "Kerroshampurilainen{" + "ingredients=" + ingredients + '}';
    }

}
