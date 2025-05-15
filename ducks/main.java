package ducks;

public class main {
    public static void main(String[] args) {
        Duck redhead = new RedHead();
        //redhead.performFly();
        redhead.performQuack();
        redhead.performFly();
        redhead.display();
    }
}
