/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

import abstractfactory.adidas.AdidasFarkut;
import abstractfactory.adidas.AdidasKengat;
import abstractfactory.adidas.AdidasLippis;
import abstractfactory.adidas.AdidasTpaita;

/**
 *
 * @author tristan
 */
public class AdidasHylly implements IVaatekaappi{

    @Override
    public IFarkut pueFarmarit() {
        return new AdidasFarkut();
    }

    @Override
    public ITpaita pueTpaita() {
        return new AdidasTpaita();
    }

    @Override
    public ILippis pueLippis() {
        return new AdidasLippis();
    }

    @Override
    public IKengat pueKengat() {
        return new AdidasKengat();
    }
    
}
