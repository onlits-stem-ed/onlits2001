package local.onlits.onlits2001.despat.headfirst.strategyduck;

public class RubberDuck extends Duck {
    RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    void display() {
        System.out.println("Hello! I am a rubber duck.");
    }
}
