public class Kuh extends Tier {
    //Eigenschaften / Attribute
        int hufe;

    //Konstruktor
    public Kuh(String name, int groeße, int gewicht, int hufe){
            super(name, groeße, gewicht);
            this.hufe = hufe;
    }

    @Override
    public void essen() {
        System.out.println("Die Kuh muss das essen immer wiederkauen");
        super.essen();
    }
}
