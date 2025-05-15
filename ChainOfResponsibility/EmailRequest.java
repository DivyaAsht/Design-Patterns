public class EmailRequest{
    String type;
    String descp;
    public EmailRequest(String type, String descp){
        this.type=type;
        this.descp=descp;
        System.out.println(descp);
    }
}