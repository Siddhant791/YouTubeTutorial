package javapractice.runnablepractice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MainRunnable {
    public static void main(String[] args) throws Exception {

//        System.out.println("In Main thread");
//
//        Runnable test = () -> {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Test");
//        };
//
////        test.run();
//        Thread thread = new Thread(test);
//        thread.start();
//
//        System.out.println("In Main thread after calling test task");



        // insert start time code for program
        System.out.println("In Main thread");
        long startTime = System.currentTimeMillis();

        Callable<Pieces> onionCutting = () -> {
            System.out.println("Cutting onion");
            try {
                Thread.sleep(5000);
                System.out.println("cutting onion completed");
                Onion onion = new Onion("Onion");
                Pieces pieces = onion.cut();
                return pieces;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Callable<Pieces> tomatoCutting = () -> {
            System.out.println("Cutting tomato");
            try {
                Thread.sleep(3000);
                System.out.println("Cutting tomato completed");
                Tomato tomato = new Tomato("Tomato");
                Pieces Pieces = tomato.cut();
                return Pieces;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };


        FutureTask<Pieces> futureTaskTomatoPieces = new FutureTask<>(tomatoCutting);

        Thread chotaBhai = new Thread(futureTaskTomatoPieces);
        chotaBhai.start();

        Pieces tomatoPieces = futureTaskTomatoPieces.get();

        Pieces onionPieces = onionCutting.call();
//        Thread chotaBhai = new Thread(tomatoCutting);
//        chotaBhai.start();

//        tomatoCutting.run();



        List<Pieces> piecesList = new ArrayList<>();
        piecesList.add(onionPieces);
        piecesList.add(tomatoPieces);

        System.out.println(piecesList);


        long endTime = System.currentTimeMillis();

        System.out.println("Total time taken is " + (endTime - startTime)/1000.0 + " seconds");

    }

    // Thread -> Runnable task (task is a function which we want to run in another thread apart from main)
    // Thread.start()

    static class Animal extends Thread{

    }
}



