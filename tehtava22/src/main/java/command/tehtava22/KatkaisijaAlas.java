package command.tehtava22;

/**
 *
 * @author tristan
 */
public class KatkaisijaAlas implements Command {

    private Valkokangas kangas;

    public KatkaisijaAlas(Valkokangas kangas) {
        this.kangas = kangas;
    }

    @Override
    public void execute() {
        kangas.alas();
    }

}
