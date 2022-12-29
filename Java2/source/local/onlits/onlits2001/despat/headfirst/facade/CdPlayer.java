package local.onlits.onlits2001.despat.headfirst.facade;

public class CdPlayer {
    Amplifier amplifier;

    void on() {
        System.out.println("Starting CD Player...");
    }

    void off() {
        System.out.println("Closing CD Player...");
    }

    void eject() {
        System.out.println("CD ejected...");
    }

    void pause() {
        System.out.println("CD paused...");
    }

    void play() {
        System.out.println("CD playing...");
    }

    void play(String movie) {
        System.out.println("Playing Movie: " + movie + "...");
    }

    void stop() {
        System.out.println("CD stopped playing...");
    }
}
