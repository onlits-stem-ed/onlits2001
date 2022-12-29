package local.onlits.onlits2001.despat.headfirst.strategyduck;

public class Client {
    public static void main(String[] args) {
        Duck d = new MallardDuck();
        d.display();
        d.swim();
        d.performFly();
        d.performQuack();
        System.out.println();
        d = new RedheadDuck();
        d.display();
        d.swim();
        d.performFly();
        d.performQuack();
        System.out.println();
        d = new RubberDuck();
        d.display();
        d.swim();
        d.performFly();
        d.performQuack();
        System.out.println();
        d = new DecoyDuck();
        d.display();
        d.swim();
        d.performFly();
        d.performQuack();
        System.out.println();
        d = new ModelDuck();
        d.setFlyBehavior(new FlyRocketPowered());
        d.display();
        d.swim();
        d.performFly();
        d.performQuack();
        System.out.println();
        d = new ModelDuck();
        d.display();
        d.swim();
        d.performFly();
        d.performQuack();
        System.out.println();
    }
}
