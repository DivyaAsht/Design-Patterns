package ducks;

public class RedHead extends Duck{
    public RedHead(){
        quac=new Quacks();
        fl=new flywithwings();
       // super(new flywithwings(),new squeak());
    }
    public void display(){
        System.out.println("I am real redhead duck");
    }
}
