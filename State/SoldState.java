public class SoldState implements State{
    Gumball gumball;
    public SoldState(Gumball gumball){
        this.gumball=gumball;
    }
    public void insertQuarter(){
        System.out.println("Plz wait we are already giving u a gumball ");
    }
    public void ejectQuarter(){
        System.out.println(" sorry u already turned the crank");
    }
    public void turnCrank(){
        System.out.println("Turning twice doesnt give u another gumball");
    }
    public void dispense(){
        gumball.releaseBall();
        if(gumball.getCount()>0){
            gumball.setState(gumball.getNoQuarterState());
        }
        else{
            System.out.println("Oops!! out of gumballs.");
            gumball.setState(gumball.getSoldOutState());
        }
    }
    public void refill(){}
    public String toString(){
        return "dispensing a gumball...";
    }
}
