import java.util.Scanner;

public class GoogleKonto {

    private String benutzerName;
    private String passwort;

    public GoogleKonto(String benutzerName, String passwort) {
        this.benutzerName = benutzerName;
        this.passwort = passwort;
    }

    public String getBenutzerName() {
        return benutzerName;
    }

    public void setBenutzerName(String benutzerName) {
        this.benutzerName = benutzerName;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        if(passwort.equals(this.passwort)){
            System.out.println("Passwort stimmt kann geändert werden");
            System.out.println("Bitte neues PW eingeben:");
            Scanner scan = new Scanner(System.in);
            String newPW = scan.nextLine();
            this.passwort = newPW;
            System.out.println("Das neue passwort lautet: " + this.passwort);
        }else{
            System.out.println("Passwort falsch kann nicht geändert werden");
        }

    }
}
