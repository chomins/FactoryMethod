public class BeijingPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new HandDough();
    }

    @Override
    public Sauce createSauce() {
        return new BeijingSauce();
    }

    @Override
    public Cheese createCheese() {
        return new RicotaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies vaggies [] = {new BeijingPizzaIngredientFactory.Garlick(), new BeijingPizzaIngredientFactory.Onion()};
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

    @Override
    public Lamb createLamb() {
        return new FreshLamb();
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

    private class FreshLamb extends Lamb {
        FreshLamb(){
            System.out.println("신선한 양고기 ");
        }
    }

    private class RicotaCheese extends Cheese {
        RicotaCheese(){
            System.out.println("리코타치즈");
        }
    }

    private class BeijingSauce extends Sauce {
        BeijingSauce(){
            System.out.println("Sauce");
        }
    }

    private class HandDough extends Dough {
        HandDough(){
            System.out.println("handDough");
        }
    }
}
