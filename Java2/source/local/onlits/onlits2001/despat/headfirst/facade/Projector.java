package local.onlits.onlits2001.despat.headfirst.facade;

public class Projector {
    DvdPlayer dvdPlayer;

    void on() {
        System.out.println("Starting Projector...");
    }

    void off() {
        System.out.println("Closing Projector...");
    }

    void tvMode() {
        System.out.println("TV mode activated...");
    }

    void wideScreenMode() {
        System.out.println("Wide Screen mode activated...");
    }
}
