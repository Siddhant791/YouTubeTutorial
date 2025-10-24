package javapractice.runnable;

public class RunnableMain {
    public static void main(String[] args) {
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
