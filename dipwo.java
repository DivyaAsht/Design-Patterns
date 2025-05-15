 class smsnotifi{
    public void sendsms(String msg){
        System.out.println("sending sms :"+msg);
    }
}
 class emailnotifi{
    public void sendemail(String msg){
        System.out.println("sending email :"+msg);
    }
}
 class notifiservice {
    private smsnotifi sms;
    private emailnotifi email;

    public notifiservice(smsnotifi sms, emailnotifi email){
        this.sms=sms;
        this.email=email;
    }
    public void notifybyemail(String msg){
        email.sendemail(msg);
    }
    public void notifybysms(String msg){
        sms.sendsms(msg);
    }
}

public class dipwo {
    public static void main(String[] args) {
        emailnotifi email=new emailnotifi();
        smsnotifi sms = new smsnotifi();
        notifiservice ns = new notifiservice(sms, email);
        ns.notifybyemail("hello this is am email.");
        ns.notifybysms("hello this is sms.");
    }
}
