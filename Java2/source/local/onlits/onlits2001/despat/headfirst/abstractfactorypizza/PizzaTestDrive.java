package local.onlits.onlits2001.despat.headfirst.abstractfactorypizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        System.out.println("------------ Ethan Order -----------");
        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        nyPizzaStore.orderPizza("cheese");
        System.out.println("------------ Joel Order -----------");
        PizzaStore cgPizzaStore = new ChicagoStylePizzaStore();
        cgPizzaStore.orderPizza("cheese");
    }
}
