package eg2;

public class Main {
    public static void main(String[] args) {
        LeaveRequest req = new LeaveRequest(6);

        LeaveHandler report1 = new ReportingManager1();
        LeaveHandler report2 = new ReportingManager2();
        LeaveHandler director = new DirectorManager();

        report1.setNext(report2);
        report2.setNext(director);

        report1.HandleRequest(6);
            
    }
}
