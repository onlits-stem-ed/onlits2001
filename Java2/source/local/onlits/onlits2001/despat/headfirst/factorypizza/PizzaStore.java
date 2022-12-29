package local.onlits.onlits2001.despat.headfirst.factorypizza;

public abstract class PizzaStore {
    Pizza pizza;
    public final Pizza orderPizza(String type) {
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type); //Factory Method
}