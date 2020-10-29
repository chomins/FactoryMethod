public class DependentPizzaStore {
    Pizza pizza = null;
    Pizza createPizza(String style,String type) {

        if(style.equals("Seoul")){
            if (type.equals("cheese")){
                pizza = new SeoulStyleCheesePizza();
            }
            if (type.equals("veggie")){
                pizza = new SeoulStyleVeggiePizza();
            }
            if (type.equals("clam")){
                pizza = new SeoulStyleClamPizza();
            }
            else{
                pizza = new SeoulStyleKimchiPizza();
            }

        }
        else{
            System.out.println("서울지역 외 피자는 안팔아요.");
            return null;
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }



}
