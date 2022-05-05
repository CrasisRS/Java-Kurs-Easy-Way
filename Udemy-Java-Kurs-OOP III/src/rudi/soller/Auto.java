package rudi.soller;

public class Auto {

    String autoMarke;
    Reifen reifen;

    public Auto (){

    }



    public Auto(String reifenMarke, String reifenTyp, String autoMarke){
        reifen = new Reifen(reifenMarke, reifenTyp);
        this.autoMarke = autoMarke;
    }

    public void ausgabeDaten(){
        System.out.println(this.autoMarke);
        System.out.println(this.reifen.reifenMarke);

    }

}
