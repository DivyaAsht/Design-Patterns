public class Main {
    public static void main(String[] args) {
        TV tv = new ConcreteTV();
        Iterator iterator=tv.getIterator();
        while(iterator.hasNext()){
            String channel=iterator.next();
            System.out.println("TV is playnig channel : "+channel);
        }
    }
}
