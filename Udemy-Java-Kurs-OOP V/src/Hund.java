public class Hund extends Tier {

    //Eigenschaften / Attribute
        int zaehne;

    //Konstruktor
    public Hund(String name, int groeße, int gewicht){
        super(name, groeße, gewicht);
        this.zaehne = zaehne;
    }

    @Override
    public void essen() {
        System.out.println("Er muss sein Essen noch kauen");


    }

    @Override
    public void atmen() {
        System.out.println("Der Hund atmet über die Lunge");
    }
}
