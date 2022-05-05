public class Laptop {

    int ram;
    int preis;
    String marke;

    public Laptop(int ram, int preis, String marke) {
        this.ram = ram;
        this.preis = preis;
        this.marke = marke;
    }

    public void ausgabe(){
        System.out.println("Marke: " + this.marke + " RAM: " + this.ram + "gb " +  " Preis: " + this.preis + "€");
    }

}
