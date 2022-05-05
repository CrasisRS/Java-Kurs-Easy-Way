public interface ITelefon {
    // Eigenschaften /Attribute -> nur Konstanten


    public static final String NETZANBIETER = "Telekom";  //Konstanten immer groß / final = nichtmehr ändern - Automatisch final



    //Methodensignaturen / Methodenköpfe

    public void powerON();              //im interface automatisch abstract
    public boolean esKlingelt();
    public boolean anrufen();





}
