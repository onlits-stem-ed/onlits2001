package local.onlits.onlits2001.despat.headfirst.abstractfactorypizza;

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

    abstract Pizza createPizza(String type); //Factory Method
}