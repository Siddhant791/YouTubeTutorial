package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Practice {
    public static void main(String[] args) throws Exception {
        ExecutorService ex = Executors.newCachedThreadPool();
        List<Future<Integer>> futureList = new ArrayList<>();

        Callable<Integer> task = () -> {

            Random random = new Random();
            int number = random.nextInt(0,3);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (number == 1) {
                throw new RuntimeException("Exception thrown");
            }
            System.out.println("Not thrown exception ");
            return 78;
        };

        for (int i = 0; i < 10; i++){
            Future<Integer> tasksResult = ex.submit(task);
            futureList.add(tasksResult);
        }

        for (Future<Integer> future : futureList){
            System.out.println(future.get());
//            try {
//            } catch (Exception e) {
//                System.out.println("Exception thrown");
//            }
        }



//        ex.execute();
//        ex.shutdownNow();
        ex.shutdown();
//        ex.awaitTermination(1, java.util.concurrent.TimeUnit.DAYS);
    }
}
