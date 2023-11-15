package memento.tehtava11;

/**
 *
 * @author tristan
 */
public class Memento {

    private final int secretNumber;

    public Memento(int secretNumber) {
        this.secretNumber = secretNumber;

    }

     int getSecretNumber() {
        return secretNumber;
    }

}
