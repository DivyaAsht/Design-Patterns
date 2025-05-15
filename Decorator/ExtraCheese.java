public class ExtraCheese extends BurgerDecorator{
    private Burger burger;
    public ExtraCheese(Burger burger){
        this.burger=burger;
    }
    public String getdescription(){
        return burger.getdescription() + " with extra cheese topping";
    }
    public double getcost(){
        return burger.getcost() + 50.0;
    }
}