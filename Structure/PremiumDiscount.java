public class PremiumDiscount implements DiscountStrategy{
    public void applyDiscount(double amount){
        System.out.println("Premium Discount :"+ (amount-500));
    }
}