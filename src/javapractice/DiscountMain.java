package javapractice;

import java.util.function.Function;

public class DiscountMain {
    public static void main(String[] args) {

        System.out.println("In DiscountMain");
        int price = 100;
        DiwaliDiscount diwaliDiscount = new DiwaliDiscount();
        HoliDiscount holiDiscount = new HoliDiscount();
        FlatDiscount flatDiscount = new FlatDiscount();

        Discount ganeshaDiscount = (p) -> Math.round(p * 0.6f);
        Discount myCustomeDiscount = getFunctionForPercentageDiscount(30);

        System.out.println(getFinalPrice(price,myCustomeDiscount));
    }

    public static long getFinalPrice(int price, Discount discount){
        return discount.priceAfterDiscount(price);
    }

    public static Discount getFunctionForPercentageDiscount(int percentage){
        double multiplier = (100.0 - percentage)/ 100.0;
        return (price) -> Math.round(price * multiplier);
    }
}
