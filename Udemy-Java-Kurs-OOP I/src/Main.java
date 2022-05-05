public class Main {
    public static void main(String[] args) {


/*        Auto bmw = new Auto();
        bmw.marke = "BMW";
        bmw.preis = 5000;
        bmw.reifen = 4;
        bmw.vergleichePreis(10000);

        System.out.println("Marke: " + bmw.marke + " Preis: " + bmw.preis);
        bmw.gasgeben();
        bmw.bremsen();

        Auto audi = new Auto();
        audi.marke = "Audi";
        audi.preis = 6000;
        audi.reifen = 4;
        audi.vergleichePreis(4000);

        System.out.println("Marke: " + audi.marke + " Preis: " + audi.preis);
        audi.gasgeben();
        audi.bremsen();

        Auto vw = new Auto();
        vw.marke = "VW";
        vw.preis = 3000;
        vw.reifen = 4;

        System.out.println("Marke: " + vw.marke + " Preis: " + vw.preis);
        vw.gasgeben();

        Auto mercedes = new Auto(4, 5000, "Mercedes");
        System.out.println("Reifenanzahl: " + mercedes.reifen + " Preis: " + mercedes.preis + " Marke: " + mercedes.marke);
        mercedes.gasgeben();*/

        Hund bello = new Hund("Bello", "hovawart", 4);
        bello.bellen();


        Hund klara = new Hund ("Klara", "hovawart", 12);
        klara.bellen();

        Laptop lenovo = new Laptop(16, 800, "Lenovo");
        lenovo.ausgabe();

        Laptop samsungLaptop = new Laptop(8, 600, "Samsung");
        Laptop medionLaptop = new Laptop(4, 400, "Medion");

        samsungLaptop.ausgabe();
        medionLaptop.ausgabe();


        Auto bmw = new Auto();
        bmw.bremsen(); //objektmethode
        bmw.marke = "BMW";



        Auto.ausgabe(); //static ohne objekt überlebensfähig


    }
}
