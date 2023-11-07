package visitor.tehtava13;

/**
 *
 * @author tristan
 */
public class Charmander implements PokemonTrainer {

    private Charmander() {

    }
    private static Charmander INSTANCE = null;

    public static Charmander getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Charmander();
        }
        return INSTANCE;
    }

    @Override
    public void attack() {
        System.out.println("Charmander scratches");
    }

    @Override
    public void specialAttack() {
        System.out.println("Charmander gives a swing with it's tail!");
    }

    @Override
    public void evolve(Pokemon pokemon) {
        pokemon.setState(Charmeleon.getInstance());
        System.out.println("Something is happening!?!!!..");
        System.out.println("Charmander turns into Charmeleon!");
    }

    @Override
    public void train(Pokemon pokemon) {
        int max = 15;
        int min = 1;
        int range = max - min + 1;
        int xp = (int) (Math.random() * range) + min;
        pokemon.setXp(xp);
        System.out.println("Charmander hikoilee aivan tajuttomasti. Kokemuspisteitä sataa taskuun " + xp + " pisteen verran.");
        if (pokemon.getXp() >= 50) {
            evolve(pokemon);
            pokemon.resetXp();
            System.out.println("xp resetted");
        }
    }

}
