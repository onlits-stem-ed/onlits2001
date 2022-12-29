package local.onlits.onlits2001.despat.headfirst.facade;

public class DvdPlayer {
    Amplifier amplifier;

    void on() {
        System.out.println("Starting DVD Player...");
    }

    void off() {
        System.out.println("Closing DVD Player...");
    }

    void eject() {
        System.out.println("DVD ejected...");
    }

    void pause() {
        System.out.println("DVD paused...");
    }

    void play() {
        System.out.println("DVD playing...");
    }

    void play(String movie) {
        System.out.println("Playing Movie: " + movie + "...");
    }

    void setSurroundAudio() {
        System.out.println("Sound mode changed to Surround mode...");
    }

    void setTwoChannelAudio() {
        System.out.println("Sound mode changed to Stereo mode...");
    }

    void stop() {
        System.out.println("DVD stopped playing...");
    }
}
