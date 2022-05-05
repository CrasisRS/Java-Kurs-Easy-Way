public class Vogel extends Tier {

    public Vogel(String name, int groeße, int gewicht) {
        super(name, groeße, gewicht);
    }

    @Override
    public void essen() {
        System.out.println("Der Vogel pickt sein essen auf");
    }

    @Override
    public void atmen() {
        System.out.println("Der Vogel atmet über seine Lungen");
    }


}
