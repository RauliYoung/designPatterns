/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package command.tehtava22;

/**
 *
 * @author tristan
 */
public class Tehtava22 {

    public static void main(String[] args) {
        Valkokangas kangas = new Valkokangas();

        Command ylos = new KatkaisijaYlos(kangas);
        Command alas = new KatkaisijaAlas(kangas);

        Katkaisija vasen = new Katkaisija(alas);
        Katkaisija oikea = new Katkaisija(ylos);
        
        vasen.push();

        
        oikea.push();

    }
}
