public class Main {
    public static void main(String args[]){
        Video netflix = new NetflixVideo(new HD4Kprocessor());
        netflix.play("abc.mp4");
        Video prime = new PrimeVideo(new HDprocessor());
        prime.play("xyz.mp4");
    }    
}