package visitor.tehtava13;

/**
 *
 * @author tristan
 */
public class BonusXpTrainer implements PokemonStateVisitor {

   public void visit(Pokemon pokemon) {
        if (pokemon.getState() instanceof Charmander) {
            int bonusXp = 10; 
            int currentXp = pokemon.getXp();
            System.out.println("Lets hit " + pokemon.toString() + " with some bonus points!");
            pokemon.setXp(currentXp + bonusXp);
        } else if (pokemon.getState() instanceof Charmeleon) {
            int bonusXp = 20; 
            int currentXp = pokemon.getXp();
            System.out.println("Lets hit " + pokemon.toString() + " with some bonus points!");
            pokemon.setXp(currentXp + bonusXp);
        } else if (pokemon.getState() instanceof Charizard) {
            int bonusXp = 30; 
            int currentXp = pokemon.getXp();
            System.out.println("Lets hit " + pokemon.toString() + " with some bonus points!");
            pokemon.setXp(currentXp + bonusXp);
        }
    }
}
