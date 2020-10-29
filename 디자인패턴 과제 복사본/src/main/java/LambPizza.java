public class LambPizza extends AbstractPizza {
    PizzaIngredientFactory pizzaIngredientFactory ;
    public LambPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        name = "LambPizza";
        System.out.println("preparing "+name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        lamb = pizzaIngredientFactory.createLamb();
    }
}
