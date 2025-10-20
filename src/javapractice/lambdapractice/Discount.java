package javapractice.lambdapractice;

@FunctionalInterface
public interface Discount {
    long priceAfterDiscount(int price);
}
