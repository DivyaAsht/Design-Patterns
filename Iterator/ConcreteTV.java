public class ConcreteTV implements TV{
    private String[] channels={"BBC","HBO","MAX","Disney"};
    private Iterator iterator;

    public ConcreteTV(){
        iterator = new ConcreteIterator();
    }
    public Iterator getIterator(){
    return iterator;
    }

    public class ConcreteIterator implements Iterator{
        int index=0;
        public boolean hasNext(){
            if(index<channels.length){
                return true;
            }
            else{
                return false;
            }
        }
        public String next(){
            if(hasNext()){
                return channels[index++];
            }
            else{
                return null;
            }
        }
    }
}
