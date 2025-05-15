interface notifier{
    void send(String msg);
}


class emailnotifi implements notifier{
    public void send(String msg){
        System.out.println("sending email :"+msg);
    }
}

class smsnotifi implements notifier{
    public void send(String msg){
        System.out.println("sending msg :"+msg);
    }
}

class notifiservice{
    private notifier noti;
    public notifiservice(notifier noti){
        this.noti=noti;
    }
    public void notify(String msg){
        noti.send(msg);
    }
}
public class dipwith {
    public static void main(String[] args) {
        notifier email = new emailnotifi();
        notifier sms = new smsnotifi();

        notifiservice ne = new notifiservice(email);
        notifiservice ns = new notifiservice(sms);

        ne.notify("hello via email.");
        ns.notify("hello via sms.");
        
    }
}
