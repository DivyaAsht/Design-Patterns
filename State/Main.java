public class Main {
    public static void main(String[] args) {
        Gumball gumball = new Gumball(2);
        System.out.println(gumball);
        gumball.insertQuarter();
        gumball.turnCrank();
        System.out.println(gumball);
        gumball.insertQuarter();
        gumball.turnCrank();
        gumball.insertQuarter();
        gumball.turnCrank();

        gumball.refill(5);
        gumball.insertQuarter();
        gumball.turnCrank();
        System.out.println(gumball);
    }
    
}
