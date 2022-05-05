import java.util.ArrayList;

public class DSArrayList {

    public static void main(String[] args) {
        //Arraylist erstellen
        ArrayList einkaufsListe = new ArrayList();
        ArrayList<String> namensListe = new ArrayList<String>();
        //Dateneingabe:
        einkaufsListe.add("Wasser");
        einkaufsListe.add("Brot");
        //einkaufsListe.add(new Integer(4));


        namensListe.add("Hans");
        namensListe.add("Peter");
        //namensListe.add(new Double(3.4));

        //Datenausgabe:
        for(int i = 0; i < namensListe.size(); i++){
            namensListe.get(i);
            System.out.println("Name: " + namensListe.get(i));
        }

        for (String string: namensListe) {
            System.out.println("Die Länge des Namens ist: " + string.length());
            
        }
    }


}
