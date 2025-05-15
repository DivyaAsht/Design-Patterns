package eg2;

abstract public class LeaveHandler {
    LeaveHandler handler;
    public void setNext(LeaveHandler handler){
        this.handler=handler;
    }
    public abstract void HandleRequest(int noOfDays);
}
