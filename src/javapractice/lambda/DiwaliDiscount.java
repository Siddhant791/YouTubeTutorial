package javapractice.lambda;

public class DiwaliDiscount implements Discount{

    @Override
    public long discountedPrice(int price) {
        return Math.round(price * 0.4f);
    }
}
