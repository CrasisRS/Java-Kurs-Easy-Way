public class GalaxyJ3 extends Samsung implements ITelefon {


    public GalaxyJ3(double preis, String produktTyp) {
        super(preis, produktTyp);
    }

    @Override
    public void powerON() {
        System.out.println("geht an der Seite an");
    }

    @Override
    public boolean esKlingelt() {
        return false;
    }

    @Override
    public boolean anrufen() {
        return false;
    }
}
