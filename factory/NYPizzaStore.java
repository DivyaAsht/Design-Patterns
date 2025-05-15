public class NYPizzaStore extends PizzaStore{
    public Pizza createPizza(String type){
        Pizza pizza=null;
        if(type.equals("NYCheese")){
            pizza=new CheesePizza();
        }
        else if(type.equals("NVeggie")){
            pizza=new VeggiePizza();
        }
        else
        return null;
    }
}

}
