public class NoQuarterState implements State{
    Gumball gumball;

    public NoQuarterState(Gumball gumball){
        this.gumball=gumball;
    }
    public void insertQuarter(){
        System.out.println("You inserted a Quarter ");
        gumball.setState(gumball.getHasQuarterState());
    }
    public void ejectQuarter(){
        System.out.println("You havent inserted a Quarter ");
    }
    public void turnCrank(){
        System.out.println("You iturned, but no quarter ");
    }
    public void dispense(){
        System.out.println("You need to pay first");
    }
    public void refill(){}
    public String toString(){
        return "Waiting for quarter...";
    }
}
