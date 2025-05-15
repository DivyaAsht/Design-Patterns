public class Main {
    public static void main(String[] args) {
        EmailRequest em = new EmailRequest("Spam Email", "Congratulations!! u have won $120000");

        EmailHandler spam = new SpamHandler();
        EmailHandler fan = new FanHandler();
        EmailHandler Complaint = new complaintHandler();

        spam.setNext(fan);
        fan.setNext(Complaint);

        spam.handleRequest(em);
    }
    
}
