package local.onlits.onlits2001.despat.headfirst.factorypizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    public Pizza createPizza(String item)
    {
        if(item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if(item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else {
            return null;
        }
    }
}