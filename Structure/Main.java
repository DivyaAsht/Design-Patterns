public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new HolidayDiscount());
        cart.calBill(1000);
    }
    
}
