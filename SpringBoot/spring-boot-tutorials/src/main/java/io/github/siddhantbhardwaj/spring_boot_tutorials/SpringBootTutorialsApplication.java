// SpringMorningApplication.java
package io.github.siddhantbhardwaj.spring_boot_tutorials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringBootTutorialsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorialsApplication.class, args);
    }
}

// Runner is a normal component that asks for Kid
@Component
class MorningRunner implements CommandLineRunner {
    private final Kid kid;

    @Autowired
    public MorningRunner(Kid kid) {
        this.kid = kid;
    }

    @Override
    public void run(String... args) {
        kid.getReadyAndLeave();
    }
}

@Component
class Kid {

    @Autowired
    private Uniform uniform;
    @Autowired
    private Shoes shoes;
    @Autowired
    private LunchBox lunchBox;
    @Autowired
    private WaterBottle bottle;

    public void getReadyAndLeave() {
        uniform.wear();
        shoes.putOn();
        lunchBox.pack();
        bottle.fill();
        System.out.println("Kid: Ready — leaving for school!");
    }
}

@Component class Uniform {
    void wear(){
        System.out.println("Uniform: worn");
    }
}

@Component class Shoes {
    void putOn(){
        System.out.println("Shoes: on");
    }
}

@Component class WaterBottle {
    void fill(){
        System.out.println("Bottle: filled");
    }
}

interface Food {
    String describe();
}

@Component
class Sandwich implements Food {
    public String describe(){
        return "Sandwich";
    }
}

@Component class LunchBox {

    @Autowired
    private Food food;

    void pack(){
        System.out.println("LunchBox: packed with " + food.describe());
    }
}
