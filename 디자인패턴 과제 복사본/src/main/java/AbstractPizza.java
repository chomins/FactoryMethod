import java.util.ArrayList;

public abstract class AbstractPizza {
    String name;
    PizzaIngredientFactory.Dough dough;
    PizzaIngredientFactory.Sauce sauce;
    PizzaIngredientFactory.Veggies veggies[];
    PizzaIngredientFactory.Cheese cheese;
    PizzaIngredientFactory.Kimchi kimchi;
    PizzaIngredientFactory.Clam clam;



    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        return display.toString();
    }
    public void setName(String seoulStyleCheesePizza) {
        this.name=seoulStyleCheesePizza;
    }
}
