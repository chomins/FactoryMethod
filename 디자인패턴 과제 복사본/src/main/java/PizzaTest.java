public class PizzaTest {

        public static void main(String[] args) {

                //DependentPizzaStore
                DependentPizzaStore dependentPizzaStore = new DependentPizzaStore();
                Pizza depPizza = dependentPizzaStore.createPizza("Beijing","lamb");
                System.out.println("you ordered a "+depPizza+ "\n");
                //factory method
                PizzaStore beijingStore = new BeijingPizzaStore();
                Pizza pizza = beijingStore.orderPizza("lamb");
                System.out.println("Ethan ordered a " + pizza+ "\n");
                //Abstract Factory
                PizzaIngredientFactory pizzaIngredientFactory = new BeijingPizzaIngredientFactory();
                AbstractPizzaStore abstractPizzaStore = new BeijingPizzaStoreAbstractFactory();
                AbstractPizza abstractPizza = abstractPizzaStore.orderPizza("lamb");
                System.out.println("Ethan ordered a " + abstractPizza+ "\n");




        }
}

