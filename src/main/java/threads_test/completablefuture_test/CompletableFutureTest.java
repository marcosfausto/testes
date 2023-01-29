package threads_test.completablefuture_test;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompletableFutureTest {

    public Future<String> calculateAsync() throws InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(500);
            completableFuture.complete("Hello");
            return null;
        });

        return completableFuture;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFutureTest completableFutureTest = new CompletableFutureTest();
        System.out.println(completableFutureTest.calculateAsync().get());

        Future<String> completableFuture =
                CompletableFuture.completedFuture("Hello");

        String result = completableFuture.get();
        assertEquals("Hello", result);

    }

    @Test
    public void testCompletedFuture() throws ExecutionException, InterruptedException {
        Future<String> completableFuture =
                CompletableFuture.completedFuture("Hello");

        String result = completableFuture.get();
        assertEquals("Hello", result);
    }

}
