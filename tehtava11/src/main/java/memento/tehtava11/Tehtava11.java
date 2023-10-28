
package memento.tehtava11;

/**
 *
 * @author tristan
 */
public class Tehtava11 {

    public static void main(String[] args) {
        Riddler riddler = new Riddler();
        int howManyPlayers = 2;
        
        Thread[] players = new Thread[howManyPlayers];
        
        for (int i = 0; i < howManyPlayers; i++) {
            players[i] = new Thread(new Player(riddler));
            players[i].start();
        }
        try {
            for (int i = 0; i < howManyPlayers; i++) {
                players[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
