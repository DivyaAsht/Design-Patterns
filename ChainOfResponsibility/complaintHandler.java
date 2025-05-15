public class complaintHandler extends EmailHandler {
    public void handleRequest(EmailRequest email){
        if(email.type.equals("Complaint Email")){
            System.out.println("complaint email handled");
        }
        else{
            handler.handleRequest(email);
        }
    }
}