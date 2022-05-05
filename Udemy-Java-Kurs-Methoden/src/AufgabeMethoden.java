public class AufgabeMethoden {
    public static void main(String[] args) {
        double zahl1 = 3.547;
        double zahl2 = 6.354;
        double ergebnis = multiply(zahl1, zahl2);
        System.out.println(ergebnis);
    }

    public static double multiply(double zahl1, double zahl2){
     double ergebnis = zahl1 * zahl2;

     return ergebnis;
    }
}
