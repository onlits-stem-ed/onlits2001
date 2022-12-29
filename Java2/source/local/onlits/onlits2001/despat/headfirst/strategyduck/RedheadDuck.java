package local.onlits.onlits2001.despat.headfirst.strategyduck;

public class RedheadDuck extends Duck {
    RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    void display() {
        System.out.println("Hello! I am a redhead duck.");
    }
}
