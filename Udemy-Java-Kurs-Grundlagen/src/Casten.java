public class Casten {
    public static void main(String[] args) {

        int userAlter = (int) 18.5; // (int) = castoperator
        System.out.println(userAlter);

        int zahl1 = 30;
        double zahl2 = zahl1;
        System.out.println(zahl2);


        //Explizites casten

        //1. Auto = 3450,45€ 2. Auto = 2690,94€
        int autoPreis1 = (int)3450.45;
        int autoPreis2 = (int)2690.94;

        int gesamtPreis = autoPreis1 + autoPreis2;
        System.out.println(gesamtPreis);
    }
}
