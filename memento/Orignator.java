public class Orignator {
    private String state;
    public void setstate(String state){
        this.state=state;
    }
    public String getstate(){
        return state;
    }
    public Memento savestateToMemento(){
        return new Memento(state);
    }
    public void getstateFromMemento(Memento memento){
        state=memento.getstate();
    }
    
}
