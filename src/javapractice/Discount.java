package javapractice;

@FunctionalInterface
public interface Discount {
    long priceAfterDiscount(int price);
}
