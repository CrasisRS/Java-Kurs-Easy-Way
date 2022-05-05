public class Auto {

    String marke;
    int ps;
    int tuerenAnzahl;
    String fahrzeugtyp;


    public Auto(String marke, int ps, int tuerenAnzahl, String fahrzeugtyp) {
        this.marke = marke;
        this.ps = ps;
        this.tuerenAnzahl = tuerenAnzahl;
        this.fahrzeugtyp = fahrzeugtyp;
    }

    public void starten(){
        System.out.println("Auto gestartet");
    }

}
