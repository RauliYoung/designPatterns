/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author tristan
 */
public class AdidasHylly implements IVaatekaappi{

    @Override
    public Farkut pueFarmarit() {
        return new Farkut();
    }

    @Override
    public Tpaita pueTpaita() {
        return new Tpaita();
    }

    @Override
    public Lippis pueLippis() {
        return new Lippis();
    }

    @Override
    public Kengat pueKengat() {
        return new Kengat();
    }
    
}
