package javapractice.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadInterviewQuestion {
    public static void main(String[] args) throws InterruptedException {
        UnsafeCounter counter = new UnsafeCounter();

        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 1000; i++) {
            executor.submit(() -> counter.increment());
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);

        System.out.println("Final Count: " + counter.getCount());
    }
}
