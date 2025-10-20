package javapractice.lambdapractice;

public class DiscountMain {
    public static void main(String[] args) {

        System.out.println("In DiscountMain");
//        int price = 100;
//        DiwaliDiscount diwaliDiscount = new DiwaliDiscount();
//        HoliDiscount holiDiscount = new HoliDiscount();
//        FlatDiscount flatDiscount = new FlatDiscount();
//
//        Discount ganeshaDiscount = (p) -> Math.round(p * 0.6f);
//        Discount myCustomeDiscount = getFunctionForPercentageDiscount(30);
//
//        System.out.println(getFinalPrice(price,myCustomeDiscount));


        DiscountFactory discountFactory = new DiscountFactory();

        discountFactory.createDiscounts("Holi",30);
        discountFactory.createDiscounts("Diwali",40);
        discountFactory.createDiscounts("Flat",10);

        Discount discount = discountFactory.getDiscount("Flat");

        System.out.println(discount.priceAfterDiscount(100));


    }

    public static long getFinalPrice(int price, Discount discount){
        return discount.priceAfterDiscount(price);
    }

    public static Discount getFunctionForPercentageDiscount(int percentage){
        double multiplier = (100.0 - percentage)/ 100.0;
        return (price) -> Math.round(price * multiplier);
    }


}
