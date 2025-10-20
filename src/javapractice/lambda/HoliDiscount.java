package javapractice.lambda;

public class HoliDiscount implements Discount {

    @Override
    public long discountedPrice(int price) {
        return Math.round(price * 0.7f);
    }
}
