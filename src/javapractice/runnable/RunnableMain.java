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

//        Runnable onionCutting = () -> {
//            System.out.println("Cutting onion");
//            try {
//                Thread.sleep(6000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Onion Cutting is completed");
//        };
//
//        Runnable tomatoCutting = () -> {
//            System.out.println("Cutting tomato");
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("tomato Cutting is completed");
//        };
//
//        Thread chotaBhai = new Thread(tomatoCutting);
//        chotaBhai.start();
//
//        onionCutting.run();



        List<Pieces> piecesList = new ArrayList<>();

        Ingredients onion = new Onion();
        Ingredients tomato = new Tomato();

        Callable onionCutting = () -> {
            try {
                List<Pieces> tomatoPices = tomato.cut(5);
                return tomatoPices;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread chotaBhai = new Thread(onionCutting);
        chotaBhai.start();

        piecesList.addAll(onion.cut(5));
//        piecesList.addAll(tomato.cut(3));


        Pan pan =new Pan();
        pan.fry(piecesList);

        Map<String,List<String>> map = new HashMap<>();
        map.computeIfAbsent("test", (key) -> new ArrayList<>());

//        tomatoCutting.run();

//        Runnable test = () -> {
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("test");
//        };
//
////        test.run();
//
//        Thread t1 = new Thread(test);
//        t1.start();
//
//        // when we call start() method of thread class it calls run method of itself on a new thread
//
        long endTime = System.currentTimeMillis();

        System.out.println("Total time taken is " + (endTime - startTime)/1000.0 + " seconds");
    }
}
