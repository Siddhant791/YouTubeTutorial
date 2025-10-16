package javapractice;

public class FlatDiscount implements Discount{
    @Override
    public long priceAfterDiscount(int price) {
        return Math.round(price * 0.9f);
    }

}
