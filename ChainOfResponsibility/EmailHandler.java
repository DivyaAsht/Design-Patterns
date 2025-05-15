abstract public class EmailHandler {
    EmailHandler handler;
    public void setNext(EmailHandler handler){
        this.handler=handler;
    }
    abstract void handleRequest(EmailRequest req);
}
