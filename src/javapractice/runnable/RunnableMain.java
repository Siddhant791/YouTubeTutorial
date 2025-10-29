package javapractice.runnable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class RunnableMain {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        System.out.println("In Main thread");

        Runnable onionCutting = () -> {
            System.out.println("Cutting onion");
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Onion Cutting is completed");
        };

        Runnable tomatoCutting = () -> {
            System.out.println("Cutting tomato");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("tomato Cutting is completed");
        };

        Thread chotaBhai = new Thread(tomatoCutting);
        chotaBhai.start();

        onionCutting.run();

        long endTime = System.currentTimeMillis();

        System.out.println("Total time taken is " + (endTime - startTime)/1000.0 + " seconds");
    }
}
