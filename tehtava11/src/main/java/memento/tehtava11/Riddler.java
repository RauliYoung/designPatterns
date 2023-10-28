package memento.tehtava11;

import java.util.Random;

/**
 *
 * @author tristan
 */
public class Riddler {
   
    public Memento joinGame() {
        int secretNumber = new Random().nextInt(100);
        return new Memento(secretNumber);
    }
    
    public synchronized boolean checkGuess(Memento memento, int guess) {
        return memento.getSecretNumber() == guess;
    }

}
