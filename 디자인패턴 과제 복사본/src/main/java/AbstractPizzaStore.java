public class AbstractPizzaStore {
    AbstractPizza createPizza(String item) {
        return null;
    }

    public AbstractPizza orderPizza(String type) {
        AbstractPizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
