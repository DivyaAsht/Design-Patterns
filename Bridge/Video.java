public abstract class Video{
    VideoProcessor processor;
    public Video(VideoProcessor processor){
        this.processor=processor;
    }
    abstract public void play(String videoFile);
}