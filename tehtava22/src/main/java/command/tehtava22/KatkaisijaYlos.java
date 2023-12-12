/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command.tehtava22;

/**
 *
 * @author tristan
 */
public class KatkaisijaYlos implements Command {

    private Valkokangas kangas;

    public KatkaisijaYlos(Valkokangas kangas) {
        this.kangas = kangas;
    }

    @Override
    public void execute() {
        kangas.ylos();
    }

}
