package ducks.single;

public class chocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static chocolateBoiler instance;

    private chocolateBoiler(){
        empty=true;
        boiled=false;
    }
    public static chocolateBoiler getInstance(){
        if(instance== null){
            instance=new chocolateBoiler();
            System.out.println("created");
        }
        return instance;
    }

    public void fill(){
        if(isempty()){
            empty=false;
            boiled = false;
            System.out.println("filed");
        }
    }
    public void boil(){
        if(!isempty() && !isboiled()){
            boiled=true;
        }
        System.out.println("boiled");
    }
    public void drain(){
        if(!isempty() && isboiled()){
            empty = true;
        }
        System.out.println("drained");
    }
    public boolean isempty(){
        return empty;
    }
    public boolean isboiled(){
        return boiled;
    }
}
