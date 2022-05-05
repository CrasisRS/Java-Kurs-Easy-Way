public class Main {

    public static void main(String[] args) {

/*        Held player1 = new Held(46);
        player1.getLebenspunkte();

        int schaden = 10;
        player1.setLebenspunkte(schaden);*/

        GoogleKonto peter = new GoogleKonto("Peter Müller", "1234");

        peter.setPasswort("1234");
        System.out.println(peter.getPasswort());




    }

}
