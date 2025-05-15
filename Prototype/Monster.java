abstract public class Monster implements Cloneable{
    String id, name;
    void setid(String id){
        this.id=id;
    }
    void setname(String name){
        this.name=name;
    }
    String getid(){
        return id;
    }
    String name(){
        return name;
    }
    abstract void move();
    public Object clone(){
        Object clone=null;
        try{
            clone=super.clone();
        }
        catch(CloneNotSupportedException e){}
        return (clone);
    
    }
}
