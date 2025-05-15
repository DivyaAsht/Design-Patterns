public class Main {
    static void test(Duck d){
        d.fly();;
        d.quack();
    }
    public static void main(String[] args) {
        Turkey t = new WildTurkey();
        TurkeyAdapter ta = new TurkeyAdapter(t);
        test(ta);
    }    
}
