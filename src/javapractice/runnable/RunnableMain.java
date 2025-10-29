package javapractice.runnable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class RunnableMain {
    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        System.out.println("In Main thread");



        Callable<Pieces> onionCutting = () -> {
            System.out.println("Cutting onion");

            Onion onion = new Onion("onion");
            Pieces piecesOfOnion  = onion.cut();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Onion Cutting is completed");
            return piecesOfOnion;
        };

        Callable<Pieces> tomatoCutting = () -> {
            System.out.println("Cutting tomato");
            Tomato tomato = new Tomato("tomato");
            Pieces piecesOfTomato = tomato.cut();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("tomato Cutting is completed");
            return piecesOfTomato;
        };

        FutureTask<Pieces> futureTask = new FutureTask<>(tomatoCutting);

        // Thread can take object of Runnable
        // Future task has implemented Runnable
        // FutureTask can take input of callable task while instantiating

        Thread chotaBhai = new Thread(futureTask);
        chotaBhai.start();

        Pieces onionPieces = onionCutting.call();

        Pieces tomatoPieces = futureTask.get();

        List<Pieces> plate = new ArrayList<>();
        plate.add(onionPieces);
        plate.add(tomatoPieces);

        System.out.println(plate);


        long endTime = System.currentTimeMillis();

        System.out.println("Total time taken is " + (endTime - startTime)/1000.0 + " seconds");
    }
}

