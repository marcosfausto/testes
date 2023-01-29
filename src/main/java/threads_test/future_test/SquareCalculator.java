package threads_test.future_test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class SquareCalculator {

    private ExecutorService executor;

    public SquareCalculator(ExecutorService executor) {
        this.executor = executor;
    }

    public Future<Integer> calculate(Integer input) {
        return executor.submit(() -> {
            System.out.println("Thread " + Thread.currentThread().getName() + " running...");
            Thread.sleep(1000);
            return input * input;
        });
    }

    public ExecutorService getExecutor() {
        return executor;
    }

}