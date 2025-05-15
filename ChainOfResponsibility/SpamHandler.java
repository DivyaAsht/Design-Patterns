public class SpamHandler extends EmailHandler {
    public void handleRequest(EmailRequest email){
        if(email.type.equals("Spam Email")){
            System.out.println("Msg Deleted");
        }
        else{
            handler.handleRequest(email);
        }
    }
}
