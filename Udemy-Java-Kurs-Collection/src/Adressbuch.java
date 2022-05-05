import java.util.ArrayList;

public class Adressbuch {

    public static void main(String[] args) {


        Adresse peterAdresse = new Adresse("Peter", "Fritzlangen.4", "Berlin");
        Adresse michaelAdresse = new Adresse("Michael", "Leipzigerstraße.6", "Hamburg");
        Adresse hansAdresse = new Adresse("Hans", "Berlinerstraße.12", "Leipzig");

        ArrayList<Adresse> adressenliste = new ArrayList<Adresse>();
        adressenliste.add(peterAdresse);
        adressenliste.add(hansAdresse);
        adressenliste.add(michaelAdresse);

        for (Adresse adresse : adressenliste) {
            System.out.println("Name: " + adresse.getName() + " Straße: " + adresse.getStrasse() + " Stadt: " + adresse.getStadt());
        }

    }
}
