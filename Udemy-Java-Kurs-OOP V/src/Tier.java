public abstract class Tier {


    //Eigenschaften / Attribute
    String name;
    int gewicht;
    int groeße;

    //Konstruktor
    public Tier(String name, int groeße, int gewicht){
        this.name = name;
        this.groeße = groeße;
        this.gewicht = gewicht;
    }

    //Methoden/Funktionen
    public abstract void essen(); //Methodenkopf / Methodensignatur

    public abstract void atmen();

    public String getName(){
        return name;
    }

}
