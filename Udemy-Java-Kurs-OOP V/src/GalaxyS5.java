public class GalaxyS5 extends Samsung implements ITelefon {

    private String farbe;

    public GalaxyS5(double preis, String produktTyp) {
        super(preis, produktTyp);
    }


    @Override
    public void powerON() {

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
