package eg2;

public class ReportingManager1 extends LeaveHandler {
    public void HandleRequest(int noOfDays){
        if(noOfDays<=5)
            System.out.println("Handled by Reporting Manager 1");
        else    
            handler.HandleRequest(noOfDays);
    }
}
