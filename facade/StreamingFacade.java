public class StreamingFacade{
    useraccount user;
    streamingServices str;
    paymentprocessor pay;
    movieSelection mov;

    StreamingFacade(){
        this.user=new useraccount();
        this.str=new streamingServices();
        this.pay=new paymentprocessor();
        this.mov=new movieSelection();
    }

    public void watchMovie(){
        user.checkSubscription("Divya Ashtikar");
        pay.processPayment("Divya Ashtikar", 1000);
        mov.selectMovie("TopGun");
        str.startStream();
    }
}