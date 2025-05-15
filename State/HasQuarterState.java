public class HasQuarterState implements State{
    Gumball gumball;
    public HasQuarterState(Gumball gumball){
        this.gumball=gumball;
    }
    public void insertQuarter(){
        System.out.println("You cant insert another Quarter ");
    }
    public void ejectQuarter(){
        System.out.println(" Quarter returned");
        gumball.setState(gumball.getNoQuarterState());
    }
    public void turnCrank(){
        System.out.println("You turned");
        gumball.setState(gumball.getSoldState());
    }
    public void dispense(){
        System.out.println("No gumball dispensed");
    }
    public void refill(){}
    public String toString(){
        return "Waiting for turn off crank...";
    }
}
