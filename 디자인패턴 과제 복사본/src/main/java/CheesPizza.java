public class CheesPizza extends AbstractPizza {

        PizzaIngredientFactory pizzaIngredientFactory ;
        public CheesPizza(PizzaIngredientFactory pizzaIngredientFactory){
            this.pizzaIngredientFactory = pizzaIngredientFactory;
        }
        @Override
        void prepare() {
            System.out.println("preparing"+name);
            dough = pizzaIngredientFactory.createDough();
            sauce = pizzaIngredientFactory.createSauce();
            cheese = pizzaIngredientFactory.createCheese();

        }


}
