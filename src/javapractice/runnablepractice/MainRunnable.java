package javapractice.runnablepractice;

public class MainRunnable {
    public static void main(String[] args) {

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

        Runnable onionCutting = () -> {
            System.out.println("Cutting onion");
            try {
                Thread.sleep(5000);
                System.out.println("cutting onion completed");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable tomatoCutting = () -> {
            System.out.println("Cutting tomato");
            try {
                Thread.sleep(3000);
                System.out.println("Cutting tomato completed");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread chotaBhai = new Thread(tomatoCutting);
        chotaBhai.start();

        onionCutting.run();
//        Thread chotaBhai = new Thread(tomatoCutting);
//        chotaBhai.start();

//        tomatoCutting.run();



        long endTime = System.currentTimeMillis();

        System.out.println("Total time taken is " + (endTime - startTime)/1000.0 + " seconds");

    }

    // Thread -> Runnable task (task is a function which we want to run in another thread apart from main)
    // Thread.start()

    static class Animal extends Thread{

    }
}
