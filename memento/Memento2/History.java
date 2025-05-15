import java.util.ArrayList;
public class History{
    public ArrayList <DocMemento> mementos;
    public History(){
        this.mementos = new ArrayList<>();
    }
    public void addMemento(DocMemento memento){
        this.mementos.add(memento);
    }
    public DocMemento getMemento(int index){
        return this.mementos.get(index);
    }
}