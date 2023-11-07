/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package visitor.tehtava13;

/**
 *
 * @author tristan
 */
public class Tehtava13 {

    public static void main(String[] args) {
        Pokemon charmander = new Pokemon();
        BonusXpTrainer xpTrainer = new BonusXpTrainer();

        while (Pokemon.stage < 3) {
            charmander.attack();
            charmander.train();
            System.out.println("Current XP: " + charmander.getXp());
            charmander.accept(xpTrainer);
        }

        System.out.println("You are the champion of Pokemon trainers..");
    }
}
