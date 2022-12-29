package local.onlits.onlits2001.despat.headfirst.strategyduck;

abstract public class Duck {
    FlyBehavior flyBehavior; // Composition
    QuackBehavior quackBehavior;

    void swim() {
        System.out.println("Swiiiiiimmming!");
    }

    abstract void display();

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }

    void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
