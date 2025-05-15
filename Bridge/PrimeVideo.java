public class PrimeVideo extends Video{
    public PrimeVideo(VideoProcessor processor){
        super(processor);
    }
    public void play(String videoFile){
        processor.process(videoFile);
    }
}