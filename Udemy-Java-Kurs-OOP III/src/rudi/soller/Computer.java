package rudi.soller;

public class Computer {

    String cpu;
    Mainboard mainborad;

    int preis;

    public Computer(String cpu, Mainboard mainborad, int preis) {
        this.cpu = cpu;
        this.mainborad = mainborad;
        this.preis = preis;
    }

    public Computer(){

    }

    public Computer(int ramSlots, int kartenSlots, int usbPorts, String cpu){
        mainborad = new Mainboard(ramSlots, kartenSlots, usbPorts);
        this.cpu = cpu;
    }
}
