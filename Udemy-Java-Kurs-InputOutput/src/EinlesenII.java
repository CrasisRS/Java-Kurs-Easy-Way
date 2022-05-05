import java.util.Scanner;

public class EinlesenII {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  //System.in = Input = Tastatur
        System.out.println("Gib dein alter ein: ");
        int alter = scan.nextInt();
        System.out.println("Gib deinen Namen ein: ");
        String name = scan.next();
        System.out.println("Name: " + name + " Alter: " + alter);


        scan.close();//Input beenden

        //nextLine() für ganze zeichenketten
        //next() nur für 1 wort, leerzeichen würde den input abschneiden


    }

}
