package command.tehtava22;

/**
 *
 * @author tristan
 */
public class Katkaisija {

    private Command cmd;

    public Katkaisija(Command cmd) {
        this.cmd = cmd;
    }

    public void push() {
        cmd.execute();
    }

}
