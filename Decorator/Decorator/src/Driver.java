 public class Driver {
    public static void main(String[] args) {
        Burger burger = new ZingerBurger();
        System.out.println(burger.getdescription() + " ," + burger.getcost());

        burger = new ExtraCheese(burger);
        System.out.println(burger.getdescription() + " ," + burger.getcost());

        burger = new ExtraMayo(burger);
        System.out.println(burger.getdescription() + " ," + burger.getcost());

    }
}