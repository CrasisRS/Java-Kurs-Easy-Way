public class SchlüsselwortIf {
    public static void main(String[] args) {

        int score = 4000;

        if (score == 5000){
            System.out.println("Herzlichen Glückwunsch neuer Rekord!");
        }else {
            System.out.println("Schade dein Score reicht leider nicht!");
        }

        int lebenPlayer = 0;

        if (lebenPlayer == 0){
            System.out.println("Spiel verloren!");
        }

        boolean gegnerHit = true;
        int highScore = 0;
        if(gegnerHit == true){
            System.out.println("Gegner getroffen!");
            highScore += 10;
            System.out.println("Highscore: " + highScore);
        }else {
            System.out.println("Daneben");
        }
    }
}
