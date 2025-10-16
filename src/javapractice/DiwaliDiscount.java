package javapractice;

public class DiwaliDiscount implements Discount{
    @Override
    public long priceAfterDiscount(int price) {
        return  Math.round(price * 0.8f);
    }

}
