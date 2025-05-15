public class ShoppingCart {
    DiscountStrategy strategy;
    public ShoppingCart(DiscountStrategy strategy){
        this.strategy=strategy;
    }
    public void calBill(double amount){
        strategy.applyDiscount(amount);
    }
}
