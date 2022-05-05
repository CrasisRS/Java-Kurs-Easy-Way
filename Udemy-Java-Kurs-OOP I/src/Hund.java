public class Hund {

    String name;
    String rasse;
    int alter;

    //Constructor
    public Hund(){

    }

    public Hund(String name, String rasse, int alter) {
        this.name = name;
        this.rasse = rasse;
        this.alter = alter;
    }
    //Methoden
    public void bellen(){
        System.out.println("Der Hund " + this.name + " bellt");
    }



}
