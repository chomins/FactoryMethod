
    public class BeijingPizzaStoreAbstractFactory extends AbstractPizzaStore{
        @Override
        AbstractPizza createPizza(String item) {
            AbstractPizza pizza = null;
            PizzaIngredientFactory pizzaIngredientFactory = new BeijingPizzaIngredientFactory();

            if(item.equals("cheese")){
                pizza = new CheesPizza(pizzaIngredientFactory);
                pizza.setName("BeijingStyleCheesePizza");
            }
            if(item.equals("veggie")){
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("BeijingStyleVeggiePizza");
            }
            if(item.equals("clam")){
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("BeijingStyleClamPizza");
            }
            if(item.equals("lamb")){
                pizza = new LambPizza(pizzaIngredientFactory);
                pizza.setName("BeijingStyleLmbPizza");
            }
            return pizza;

        }
    }

