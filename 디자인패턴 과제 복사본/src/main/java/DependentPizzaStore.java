public class DependentPizzaStore {
    Pizza pizza = null;
    Pizza createPizza(String style,String type) {

        if(style.equals("Beijing")){
            if (type.equals("cheese")){
                pizza = new BeijingStyleCheesePizza();
            }
            if (type.equals("veggie")){
                pizza = new BeijingStyleVeggiePizza();
            }
            if (type.equals("clam")){
                pizza = new BeijingStyleClamPizza();
            }
            else{
                pizza = new BeijingStylelambPizza();
            }

        }
        else{
            System.out.println("북경지역 외 피자는 안팔아요.");
            return null;
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }



}
