package visitor.tehtava13;

/**
 *
 * @author tristan
 */
public class Charizard implements PokemonTrainer {

    private Charizard() {
    }

    private static Charizard INSTANCE = null;

    public static Charizard getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Charizard();
        }
        return INSTANCE;
    }

    @Override
    public void attack() {
        System.out.println("Charizard gives a spinning burst of flames towards the enemy grilling it like a kebab.");
    }

    @Override
    public void specialAttack() {
        System.out.println("Charizard does a bodyslam included with extra bites following a fierce tail whip. Still followed by a rapid slash with the claws..");
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("Charizard is at the prime of he's life. No evolving for him anymore.");
    }

    @Override
    public void train(Pokemon pokemon) {
        System.out.println("Training just for fun, mby if levels were added. This would do something..");
    }


}
