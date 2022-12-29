package local.onlits.onlits2001.despat.headfirst.facade;

public class TheaterLights {
    void on() {
        System.out.println("Theater lights on...");
    }

    void off() {
        System.out.println("Theater lights off...");
    }

    void dim(int level) {
        System.out.println("Theater lights dimmed to level " + level + "...");
    }
}
