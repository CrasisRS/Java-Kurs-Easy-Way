
public class Auto {
    static int anzahlReifen = 4; //schon aktiv, kann ohne objekt aufgerufen werden
    int reifen;
    int preis;
    String marke;



    public Auto(){

    }

    public static void ausgabe(){
        System.out.println("Ich bin eine Klassenmethode und brauche kein Objekt");
    }

    public Auto(int reifen, int preis, String marke) {   //Konstrukter und new erstellen neuen Objekte. Die parameter füllen das objekt direkt mit werten
        this.reifen = reifen;                           // this. zeigt auf variable  sprich übergebener wert vom parameter wird der variable zugewiesen. Aber variable des objekts
        this.preis = preis;                             //Klasse zeigt nur wie das objekt auszusehen hat
        this.marke = marke;
    }
    //Funkton = Methode
    public void gasgeben(){
        System.out.println("Das Auto mit der Marke: " + this.marke + " fährt jetzt los.");
    }

    public void bremsen(){
        System.out.println("Das Auto mit der Marke:" + this.marke + " bremst nun.");
    }

    public void vergleichePreis(int preis){
        if(this.preis <= preis){
            System.out.println("Der " + this.marke + " ist billiger!");
        }else{
            System.out.println("Der " + this.marke + " ist teurer!");
        }
    }
}
