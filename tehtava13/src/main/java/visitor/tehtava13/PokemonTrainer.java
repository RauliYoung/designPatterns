package visitor.tehtava13;

/**
 *
 * @author tristan
 */
interface PokemonTrainer {

    void attack();

    void specialAttack();

    void evolve(Pokemon pokemon);

    void train(Pokemon pokemon);

}
