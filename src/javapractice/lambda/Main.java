package javapractice.lambda;

public class Main {
    public static void main(String[] args) {
        System.out.println("In Main");
        int finalBill = 100; // / getBillService
        Discount discount = new HoliDiscount();

        Discount diwaliDiscount = (p) -> { return Math.round(p * 0.4f);};

        Discount holiDiscount = new Discount() { // announymous class
            @Override
            public long discountedPrice(int price) {
                return Math.round(price * 0.7f);
            }
        };

        long dicountedPrice = diwaliDiscount.discountedPrice(finalBill);
        System.out.println(dicountedPrice);
    }

}

// price diswcount percentage
// double discountedPrice (int price)
// Interface Discount
// Holi Discount

// Diwali Discount