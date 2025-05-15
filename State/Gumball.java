public class Gumball {
    State state;
    State SoldOutState;
    State SoldState;
    State NoQuarterState;
    State HasQuarterState;
    int count =0;
    public Gumball(int gumballnumber){
        this.count=gumballnumber;
        SoldOutState=new SoldOutState(this);
        SoldState=new SoldState(this);
        NoQuarterState=new NoQuarterState(this);
        HasQuarterState=new HasQuarterState(this);
        if(gumballnumber>0){
            state=NoQuarterState;
        }
        else{
            state=SoldOutState;
        }
    }
    public void insertQuarter(){
        state.insertQuarter();
    }
    public void ejecttQuarter(){
        state.ejectQuarter();
    }
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
    public void releaseBall(){
        System.out.println("A gumball comes rolling out of the machine...");
        if(count>0){
            count=count-1;
        }
    }
    int getCount(){
        return count;
    }
    void refill(int count){
        this.count=count;
        System.out.println("Machine was just refilled, its new count = "+this.count);
        state.refill();
    }
    public State setState(State state){
        return state;
    }
    public State getSoldOutState(){
        return SoldOutState;
    }
    public State getNoQuarterState(){
        return NoQuarterState;
    }
    public State getHasQuarterState(){
        return HasQuarterState;
    }
    public State getSoldState(){
        return SoldState;
    }
    public String toString(){
        StringBuffer result = new StringBuffer();
        result.append("Gumball Machine");
        result.append("\nInventory : "+count+" gumball");
        result.append("\nMachine is in "+state+"\n");
        return result.toString();
    }

}
