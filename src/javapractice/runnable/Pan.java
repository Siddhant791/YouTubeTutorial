package javapractice.runnable;

import java.util.ArrayList;
import java.util.List;

public class Pan {

    private final List<Pieces> ingredientsList;

    public Pan() {
        this.ingredientsList = new ArrayList<>();
    }

    public void fry(List<Pieces> listOfIngredients){
        // edge cases
        if (listOfIngredients == null || listOfIngredients.isEmpty()){
            // throw custom exception
            System.out.println("No ingredients provided");
            return;
        }

        try {
            System.out.println("Frying ingredients .....");
            Thread.sleep(listOfIngredients.size()* 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ingredientsList.addAll(listOfIngredients);
    }
}
