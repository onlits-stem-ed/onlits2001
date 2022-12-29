package local.onlits.onlits2001.despat.headfirst.facade;

public class Amplifier {
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    void on() {
        System.out.println("Starting Amplifier...");
    }

    void off() {
        System.out.println("Closing Amplifier...");
    }

    void setCd() {
        System.out.println("Input set to CD...");
    }

    void setDvd() {
        System.out.println("Input set to DVD...");
    }

    void setStereoSound() {
        System.out.println("Output set to Stereo Sound Mode...");
    }

    void setSurroundSound() {
        System.out.println("Output set to Surround Sound Mode...");
    }

    void setTuner() {
        System.out.println("Input set to Tuner...");
    }

    void setVolume(int level) {
        System.out.println("Volume set to level " + level + "...");;
    }
}
