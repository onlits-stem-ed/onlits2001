package local.onlits.onlits2001.despat.headfirst.factorypizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        System.out.println("------------ Ethan Order -----------");
        PizzaStore ny1 = new NYStylePizzaStore();
        ny1.orderPizza("cheese");
        System.out.println("------------ Joel Order -----------");
        PizzaStore cg1 = new ChicagoStylePizzaStore();
        cg1.orderPizza("cheese");
    }
}
