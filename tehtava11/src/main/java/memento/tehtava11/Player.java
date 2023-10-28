package memento.tehtava11;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tristan
 */
public class Player implements Runnable {

    private static int playerNro = 1;
    private final Riddler riddler;
    private int playerNumber;

    public Player(Riddler riddler) {
        this.riddler = riddler;
        this.playerNumber = playerNro;
        playerNro++;
    }

    @Override
    public synchronized void run() {
        Memento memento = riddler.joinGame();

        while (true) {

            int guess = new Random().nextInt(100);
            boolean isRightGuess = riddler.checkGuess(memento, guess);

            System.out.println("Player nro " + playerNumber + " is guessing " + guess + " to be the right guess...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (isRightGuess) {
                System.out.println("The guess was right..");
                break;
            }

        }
    }

}
