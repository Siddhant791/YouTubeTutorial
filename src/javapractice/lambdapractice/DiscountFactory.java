package javapractice.lambdapractice;

import java.util.HashMap;
import java.util.Map;

public class DiscountFactory {

    Map<String, Discount> discountMap = new HashMap<>();

    public void createDiscounts(String discountName, double percentage){
        double multiplier = (100.0 - percentage)/100.0;
        Discount discount = (price) -> Math.round(price * multiplier);
        discountMap.put(discountName, discount);
    }

    public Discount getDiscount(String discountToBeApplied){
        return discountMap.get(discountToBeApplied);
    }
}
