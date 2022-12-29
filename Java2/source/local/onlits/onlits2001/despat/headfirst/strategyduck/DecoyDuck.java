package local.onlits.onlits2001.despat.headfirst.strategyduck;

public class DecoyDuck extends Duck {
    DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    void display() {
        System.out.println("Hello! I am a decoy duck.");
    }
}
