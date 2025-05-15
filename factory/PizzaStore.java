abstract class PizzaStore {
    public Pizza orderpizza(String type){
        Pizza pizza;
        pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        return pizza;
    }
    abstract Pizza createPizza(String type);
}
