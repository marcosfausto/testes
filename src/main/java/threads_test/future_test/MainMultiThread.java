package threads_test.future_test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainMultiThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SquareCalculator squareCalculator = new SquareCalculator(Executors.newFixedThreadPool(2));

        Future<Integer> future1 = squareCalculator.calculate(10);
        Future<Integer> future2 = squareCalculator.calculate(100);

        while (!(future1.isDone() && future2.isDone())) {
            System.out.printf(
                    "future1 is %s and future2 is %s%n",
                    future1.isDone() ? "done" : "not done",
                    future2.isDone() ? "done" : "not done"
            );
            Thread.sleep(300);
        }

        Integer result1 = future1.get();
        Integer result2 = future2.get();

        System.out.println(result1 + " and " + result2);

        squareCalculator.getExecutor().shutdown();
    }
}
