public class KimchiPizza extends AbstractPizza{
    PizzaIngredientFactory pizzaIngredientFactory ;
    public KimchiPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    @Override
    void prepare() {
        System.out.println("preparing"+name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        kimchi = pizzaIngredientFactory.createKimchi();
    }
}
