import beispielpaket.NichtDurchNullTeilenException;
import beispielpaket.Taschenrechner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    //    Taschenrechner.plus(2, 3);
     //   Taschenrechner.minus(20, 10);
        Scanner scan = new Scanner(System.in);
        try {

            System.out.println("Bitte Zahl 1 Eingeben: ");
            int userZahl1 = scan.nextInt();
            System.out.println("Bitte Zahl 2 Eingeben: ");
            int userZahl2 = scan.nextInt();
            Taschenrechner.dividiere(userZahl1, userZahl2);
        }catch(NichtDurchNullTeilenException e){
            System.out.println("Bitte neue Zahl eingeben: ");
            int neueEingabe1 = scan.nextInt();
            int neueEingabe2 = scan.nextInt();
            System.out.println(e.getMessage());

            try {
                Taschenrechner.dividiere(neueEingabe1, neueEingabe2);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }


        System.out.println("Programm geht weiter");
    }
}
