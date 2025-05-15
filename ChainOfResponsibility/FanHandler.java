public class FanHandler extends EmailHandler {
    public void handleRequest(EmailRequest email){
        if(email.type.equals("Fan Email")){
            System.out.println("Fan email Handled");
        }
        else{
            handler.handleRequest(email);
        }
    }
}
