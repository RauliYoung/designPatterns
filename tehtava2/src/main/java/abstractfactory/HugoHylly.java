/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

import abstractfactory.boss.BossFarkut;
import abstractfactory.boss.BossKengat;
import abstractfactory.boss.BossLippis;
import abstractfactory.boss.BossTpaita;

/**
 *
 * @author tristan
 */
public class HugoHylly implements IVaatekaappi {

    @Override
    public IFarkut pueFarmarit() {
        return new BossFarkut();
    }

    @Override
    public ITpaita pueTpaita() {
        return new BossTpaita();
    }

    @Override
    public ILippis pueLippis() {
        return new BossLippis();
    }

    @Override
    public IKengat pueKengat() {
        return new BossKengat();
    }
    
}
