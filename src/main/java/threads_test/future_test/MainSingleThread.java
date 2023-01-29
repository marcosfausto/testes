package threads_test.future_test;

import java.util.concurrent.*;

public class MainSingleThread {
    public static void main(String[] args) {
        // Future<Integer> future = new SquareCalculator().calculate(10);
        SquareCalculator squareCalculator = new SquareCalculator(Executors.newSingleThreadExecutor());
        Future<Integer> future = squareCalculator.calculate(10);


        while(!future.isDone()) {
            System.out.println("Calculating...");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            Integer result = future.get(1000, TimeUnit.MILLISECONDS);
            System.out.println(result);
            squareCalculator.getExecutor().shutdown();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new RuntimeException(e);
        }
    }
}
