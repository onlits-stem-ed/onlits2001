package local.onlits.onlits2001.despat.headfirst.facade;

public class Tuner {
    Amplifier amplifier;
    
    void on() {
        System.out.println("Starting Tuner...");
    }

    void off() {
        System.out.println("Closing Tuner...");
    }

    void setAm() {
        System.out.println("Tuner set to AM band...");
    }

    void setFm() {
        System.out.println("Tuner set to FM band...");
    }

    void setFrequency() {
        System.out.println("Setting Tuner Frequency...");
    }
}
