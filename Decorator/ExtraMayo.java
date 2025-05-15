public class ExtraMayo extends BurgerDecorator{
    private Burger burger;
    public ExtraMayo(Burger burger){
        this.burger=burger;
    }
    public String getdescription(){
        return burger.getdescription() + " with extra mayo topping";
    }
    public double getcost(){
        return burger.getcost() + 80.0;
    }
}