package eg2;

public class DirectorManager extends LeaveHandler {
    public void HandleRequest(int noOfDays){
        if(noOfDays>15)
            System.out.println("Handled by Directing Manager");
        else    
            handler.HandleRequest(noOfDays);
    }
}
 