package rudi.soller;

public class Main {

    public static void main(String[] args) {

/*        Computer cp1 = new Computer();
        System.out.println(cp1.mainborad);   //Null = in der Variable ist keine ADresse von einem Objekt gespeichert - var mainboard


        Mainboard board1 = new Mainboard();
        System.out.println(board1);

        cp1.mainborad = board1;
        System.out.println(cp1.mainborad); //gleiche adresse*/
//        Mainboard board2 = new Mainboard();
//        Computer cp2 = new Computer("Intel", board2, 500 );


/*
        Mainboard mainboardAsus = new Mainboard(4,2,4);
        Computer computerPeter = new Computer("Intel", mainboardAsus, 400);

//        Mainboard mainboardAsrock = new Mainboard(2,1,2);
//        Computer computerOlga = new Computer("AMD", mainboardAsrock, 350);
//        System.out.println(computerOlga.mainborad.kartenSlots);
//
        Computer computerOlga = new Computer(2,1,2,"AMD");
        System.out.println(computerOlga.mainborad.ramSlots);
*/
        Auto bmw= new Auto("Conti", "Winter", "BMW");
        bmw.ausgabeDaten();

        Auto vw = new Auto("michelin", "Sommer", "VW");
        vw.ausgabeDaten();


    }
}
