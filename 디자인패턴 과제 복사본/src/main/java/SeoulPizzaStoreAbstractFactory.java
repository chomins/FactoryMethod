public class SeoulPizzaStoreAbstractFactory extends AbstractPizzaStore{
    @Override
    AbstractPizza createPizza(String item) {
        AbstractPizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new SeoulPizzaIngredientFactory();

        if(item.equals("cheese")){
            pizza = new CheesPizza(pizzaIngredientFactory);
            pizza.setName("SeoulStyleCheesePizza");
        }
        if(item.equals("veggie")){
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("SeoulStyleCheesePizza");
        }
        if(item.equals("clam")){
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("SeoulStyleCheesePizza");
        }
        if(item.equals("kimchi")){
            pizza = new KimchiPizza(pizzaIngredientFactory);
            pizza.setName("SeoulStyleKimchiPizza");
        }
        return pizza;

    }
}
