package javapractice;

public class HoliDiscount implements Discount{
    @Override
    public long priceAfterDiscount(int price) {
        return Math.round(price * 0.7f);
    }

}
