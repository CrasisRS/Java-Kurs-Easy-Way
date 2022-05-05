public class Main {
    public static void main(String[] args) {

        Hund bello = new Hund("Bello", 50, 120, 15);
        bello.essen();

        Kuh conny = new Kuh("Conny", 178, 70, 4);
        conny.essen();

        BMW x1 = new BMW(130, 4, "Limousine", true);
        x1.starten();

        Audi a3 = new Audi(180, 4, "Kompaktklasse", true);
        a3.starten();


    }
}
