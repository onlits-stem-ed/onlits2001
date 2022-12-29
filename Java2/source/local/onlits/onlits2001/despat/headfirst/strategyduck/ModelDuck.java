package local.onlits.onlits2001.despat.headfirst.strategyduck;

public class ModelDuck extends Duck {
    ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    void display() {
        System.out.println("I am a model duck.");
    }
}
