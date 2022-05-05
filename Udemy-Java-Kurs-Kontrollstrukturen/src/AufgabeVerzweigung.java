import java.util.Scanner;

public class AufgabeVerzweigung {
    public static void main(String[] args) {

        System.out.println("Wieviele Bundesländer hat Deutschland");
        System.out.println("15 oder 3 oder 16 oder 30");

        Scanner scanner = new Scanner(System.in);
        int eingabeUser = scanner.nextInt();

        if(eingabeUser == 15 || eingabeUser == 3 || eingabeUser == 30){
            System.out.println("Das ist leider falsch");
        }else if (eingabeUser == 16){
            System.out.println("Das ist richtig!");
            System.out.println("Wie heißt der Bundespräsident");
        }else {
            System.out.println("Eingabe ist falsch");
        }
        scanner.close();
    }
}
