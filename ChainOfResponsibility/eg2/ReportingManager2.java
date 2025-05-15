package eg2;

public class ReportingManager2 extends LeaveHandler {
    public void HandleRequest(int noOfDays){
        if(noOfDays>5 && noOfDays <=15)
            System.out.println("Handled by Reporting Manager 2");
        else    
            handler.HandleRequest(noOfDays);
    }
}
