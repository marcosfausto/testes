package threads_test.forkjoin_test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Factorial extends RecursiveTask<Integer> {

    private Integer i;

    public Factorial(Integer i) {
        this.i = i ;
    }

    @Override
    protected Integer compute() {
        if (i <= 1) {
            return i;
        }
        Factorial factorial = new Factorial(i - 1);
        factorial.fork();
        return i * factorial.join();
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Factorial factorial = new Factorial(4); // 4! = 4 * 3 * 2 * 1 = 24
        forkJoinPool.execute(factorial);
        System.out.println(factorial.compute());
    }
}
