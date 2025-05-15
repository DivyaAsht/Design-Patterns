public class RegularDiscount implements DiscountStrategy{
    public void applyDiscount(double amount){
        System.out.println("Regular Discount :"+ (amount-100));
    }
}