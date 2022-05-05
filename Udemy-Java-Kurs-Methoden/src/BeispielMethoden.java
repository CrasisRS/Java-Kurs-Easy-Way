public class BeispielMethoden {
    public static void main(String[] args) {

        int gegnerLeben = 100;
        System.out.println("Gegner hat aktuell: " + gegnerLeben + " Lifepoints");

        gegnerLeben = gegnerHit(gegnerLeben);
        System.out.println("Der Gegner hat nun: " + gegnerLeben + " Lifepoints");
        gegnerLeben = gegnerHit(gegnerLeben);
        System.out.println("Der Gegner hat nun: " + gegnerLeben + " Lifepoints");
        gegnerLeben = gegnerHit(gegnerLeben);
        System.out.println("Der Gegner hat nun: " + gegnerLeben + " Lifepoints");
    }

    public static int gegnerHit(int aktuellLeben){
        int neuGegnerLeben;

        neuGegnerLeben = aktuellLeben - 20;

        return neuGegnerLeben;
    }
}
