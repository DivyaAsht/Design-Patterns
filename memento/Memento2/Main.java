public class Main
{
	public static void main(String[] args) {
	    History h = new History();
	    Document d = new Document("Hello World");
	    d.write(" msg-1 from Divya");
	    h.addMemento(d.createMemento());
	    
	    d.write(" msg-2 from Divya");
	    h.addMemento(d.createMemento());
	    
	    d.write(" msg-3 from Divya");
		System.out.println("\nCurrent Content : "+d.getContent());
		
		d.restoreMemento(h.getMemento(1));
		System.out.println("\nRestored Contents : "+d.getContent());
	}
}