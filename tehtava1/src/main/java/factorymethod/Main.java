package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();

        AterioivaOtus oppilas = new Oppilas();
        oppilas.aterioi();

        AterioivaOtus sihteeri = new Sihteeri();
        sihteeri.aterioi();       
    }
}
