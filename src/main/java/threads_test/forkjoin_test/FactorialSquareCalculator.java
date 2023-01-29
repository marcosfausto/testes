package threads_test.forkjoin_test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class FactorialSquareCalculator extends RecursiveTask<Integer> {

    private Integer n;

    public FactorialSquareCalculator(Integer n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if (n <= 1) {
            return n;
        }

     //   System.out.println("Thread " + Thread.currentThread().getName() + " running...");

        System.out.println(n);

        FactorialSquareCalculator calculator
                = new FactorialSquareCalculator(n - 1);

        calculator.fork();

        int result = n * n + calculator.join();

        System.out.println("valor de n: " + n + " resultado: " + result);

        return result;
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        FactorialSquareCalculator calculator = new FactorialSquareCalculator(4); // 3! = 3² + 2² + 1² = 14

        forkJoinPool.execute(calculator);

        calculator.compute();

    }

}