public class Client {
public static void main(String[] args) {
    MonsterRegistry.loaddata();
    Monster m=null;
    
    String landscape=args[0];
    if(landscape.equals("Air")){
        m=MonsterRegistry.getmonster("1");
    }
    if(landscape.equals("Water")){
        m=MonsterRegistry.getmonster("2");
    }
    System.out.println("New monster added "+m.name());
}
}
