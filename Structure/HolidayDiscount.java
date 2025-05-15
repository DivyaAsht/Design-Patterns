public class HolidayDiscount implements DiscountStrategy{
    public void applyDiscount(double amount){
        System.out.println("Holiday Discount :"+ (amount-1000));
    }
}