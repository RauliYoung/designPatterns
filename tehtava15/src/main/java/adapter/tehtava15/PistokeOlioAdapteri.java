/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter.tehtava15;

/**
 *
 * @author tristan
 */
public class PistokeOlioAdapteri implements PistokeAdapteri {

    private Pistoke pistoke = new Pistoke();

    @Override
    public Voltti get230Volttia() {
        return pistoke.getVolt();
    }

    @Override
    public Voltti get12Volttia() {
        Voltti voltti = pistoke.getVolt();
        return muunnataja(voltti, 19);
    }

    @Override
    public Voltti get5Volttia() {
        Voltti voltti = pistoke.getVolt();
        return muunnataja(voltti, 46);
    }

    private Voltti muunnataja(Voltti v, int i) {
        return new Voltti(v.getVoltit() / i);
    }
}
