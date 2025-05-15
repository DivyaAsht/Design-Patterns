public class Main {
    public static void main(String[] args) {
        Orignator og = new Orignator();
        CareTaker ct = new CareTaker();
        og.setstate("State-1");
        og.setstate("State-2");
        ct.add(og.savestateToMemento());

        og.setstate("State-3");
        ct.add(og.savestateToMemento());
        og.setstate("State-4");
        System.out.println("Current State : "+og.getstate());

        og.getstateFromMemento(ct.get(0));
        System.out.println("First saved state : "+og.getstate());
    }
    
}
