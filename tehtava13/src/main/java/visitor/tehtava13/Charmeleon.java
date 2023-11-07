package visitor.tehtava13;

/**
 *
 * @author tristan
 */
public class Charmeleon implements PokemonTrainer {

    private Charmeleon() {
    }

    private static Charmeleon INSTANCE = null;

    public static Charmeleon getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Charmeleon();
        }
        return INSTANCE;
    }

    @Override
    public void attack() {
        System.out.println("Charmeleon breaths a burst of fire on the enemy!");
    }

    @Override
    public void specialAttack() {
        System.out.println("Charmeleon slams the enemy with it's body!");
    }

    @Override
    public void evolve(Pokemon pokemon) {
        pokemon.setState(Charizard.getInstance());
        System.out.println("Something is happening!?!!!..");
        System.out.println("Charmeleon turns into Charizard!");
    }

    @Override
    public void train(Pokemon pokemon) {
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        int xp = (int) (Math.random() * range) + min;
        int currentXp = pokemon.getXp();
        int gainedXp = currentXp + xp;
        pokemon.setXp(xp);
        System.out.println("Charmeleon hikoilee aivan tajuttomasti. Kokemuspisteitä sataa taskuun " + gainedXp + " pisteen verran.");
        if (pokemon.getXp() >= 100) {
            evolve(pokemon);
            pokemon.resetXp();
        }
    }

}
