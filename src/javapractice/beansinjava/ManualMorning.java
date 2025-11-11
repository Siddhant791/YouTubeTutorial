package javapractice.beansinjava;

// File: ManualMorning.java
public class ManualMorning {
    public static void main(String[] args) {
        Kid kid = new Kid();
        kid.getReadyAndLeave();
    }
}

// The Kid creates and wires all dependencies itself
class Kid {
    // Kid *creates* every item (tight coupling)
    private final Uniform uniform = new Uniform();
    private final Shoes shoes = new Shoes();
    private final LunchBox lunchBox = new LunchBox(new Sandwich());
    private final WaterBottle bottle = new WaterBottle();

    public void getReadyAndLeave() {
        uniform.wear();
        shoes.putOn();
        lunchBox.pack();
        bottle.fill();
        System.out.println("Kid: Ready — leaving for school!");
    }
}

// Simple classes representing "beans"
class Uniform {
    void wear() {
        System.out.println("Uniform: worn");
    }
}

class Shoes {
    void putOn() {
        System.out.println("Shoes: on");
    }
}

class WaterBottle {
    void fill() {
        System.out.println("Bottle: filled");
    }
}

class LunchBox {
    private final Food food;

    public LunchBox(Food food) {
        this.food = food;
    }

    void pack() {
        System.out.println("LunchBox: packed with " + food.describe());
    }
}

interface Food {
    String describe();
}

class Sandwich implements Food {
    public String describe() {
        return "Sandwich";
    }
}
