public class Audi extends Auto {

    boolean quattro;
    public Audi(int ps, int tuerenAnzahl, String fahrzeugtyp, boolean quattro) {
        super("Audi", ps, tuerenAnzahl, fahrzeugtyp);
        this.quattro = quattro;
    }

    @Override
    public void starten() {
        super.starten();
        System.out.println("Der Audi startet");
    }
}
