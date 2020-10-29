public class SeoulPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new SeoulStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new SeoulStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new SeoulStyleClamPizza();
        } else if (item.equals("kimchi")) {
            return new SeoulStyleKimchiPizza();
        } else return null;
    }
}
