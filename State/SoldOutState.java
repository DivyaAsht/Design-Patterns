public class SoldOutState implements State {
    Gumball gumball;
    public SoldOutState(Gumball gumball){
        this.gumball=gumball;
    }
    public void insertQuarter(){
        System.out.println("U cant insert a quarter, the machine is sold out");
    }
    public void ejectQuarter(){
        System.out.println(" U cant eject, u havent inserted a quarter yet.");
    }
    public void turnCrank(){
        System.out.println("U turned, but there are no gumballs");
    }
    public void dispense(){
            System.out.println("No gumball dispensed.");
    }
    public void refill(){
        gumball.setState(gumball.getNoQuarterState());
    }
    public String toString(){
        return "Sold out";
    }
}
