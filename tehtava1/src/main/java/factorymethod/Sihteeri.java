package factorymethod;

public class Sihteeri extends AterioivaOtus {
    public Juoma createJuoma() {
        return new Pepsi();
    }
}
