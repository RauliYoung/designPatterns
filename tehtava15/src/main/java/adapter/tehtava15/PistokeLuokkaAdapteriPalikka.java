package adapter.tehtava15;

/**
 *
 * @author tristan
 */
public class PistokeLuokkaAdapteriPalikka extends Pistoke implements PistokeAdapteri {

    @Override
    public Voltti get230Volttia() {
        return getVolt();
    }

    @Override
    public Voltti get12Volttia() {
        Voltti voltti = getVolt();
        return muunnataja(voltti, 19);
    }

    @Override
    public Voltti get5Volttia() {
        Voltti voltti = getVolt();
        return muunnataja(voltti, 46);
    }

    private Voltti muunnataja(Voltti v, int i) {
        return new Voltti(v.getVoltit() / i);
    }

}
