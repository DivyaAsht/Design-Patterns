public class Document{
    String content;
    public Document(String content){
        this.content=content;
    }
    public void write(String text){
        this.content+=text;
    }
    public String getContent(){
        return this.content;
    }
    public DocMemento createMemento(){
        return new DocMemento(this.content);
    }
    public void restoreMemento(DocMemento memento){
        this.content=memento.getsavedContent();
    }

}