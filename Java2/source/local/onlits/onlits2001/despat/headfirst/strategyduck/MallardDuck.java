package local.onlits.onlits2001.despat.headfirst.strategyduck;

public class MallardDuck extends Duck {

    MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    void display() {
        System.out.println("Hello! I am a mallard duck.");
    }
}
