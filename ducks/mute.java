package ducks;

public class mute implements quackBehavior{
    public void quack(){
        System.out.println("can't quack <<silence>>");
    }
}
