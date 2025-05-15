public class NetflixVideo extends Video{
    public NetflixVideo (VideoProcessor processor){
        super(processor);
    }
    public void play(String videoFile){
        processor.process(videoFile);
    } 
}