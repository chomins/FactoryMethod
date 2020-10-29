public class SeoulPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new CrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new SeoulSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies vaggies [] = {new Garlick(), new Onion()};
        return vaggies;
    }

    @Override
    public Kimchi createKimchi() {
        return new Kimchi();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }

    private class CrustDough extends Dough {
    }

    private class MozzaCheese extends Cheese {
    }

    private class SeoulSauce extends Sauce {
    }

    private class Garlick extends Veggies {
    }

    private class Onion extends Veggies {
    }

    private class FreshClam extends Clam {
    }
}
