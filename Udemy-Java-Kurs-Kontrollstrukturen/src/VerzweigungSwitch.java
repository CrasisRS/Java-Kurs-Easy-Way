import java.util.Scanner;

public class VerzweigungSwitch {
    public static void main(String[] args) {


/*        switch (0){
            case 0:
                System.out.println("Die Zahl ist eine 0");
                break;
            case 3:
                System.out.println("Die Zahl ist eine 3");
                break;
            case 5:
                System.out.println("Die Zahl ist eine 5");
                break;

        }*/


        System.out.println("Wieviele Bundesländer hat Deutschland?");
        System.out.println("15 oder 3 oder 16 oder 30");

        Scanner scanner = new Scanner(System.in);
        int eingabeUser = scanner.nextInt();

        switch (eingabeUser){
            case 3:
                System.out.println("Leider Falsch!");
                break;
            case 15:
                System.out.println("Leider Falsch!");
                break;
            case 16:
                System.out.println("Richtig!");
                break;
            case 30:
                System.out.println("Leider Falsch!");
                break;
            default:
                System.out.println("Falsche Eingabe!");
        }
        }
    }

