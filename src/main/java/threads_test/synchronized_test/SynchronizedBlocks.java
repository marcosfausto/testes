package threads_test.synchronized_test;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SynchronizedBlocks {

    private int count = 0;

    public void performSynchronisedTask() {
        synchronized (this) {
            setCount(getCount()+1);
        }
    }

    @Test
    public void givenMultiThread_whenBlockSync() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        SynchronizedBlocks synchronizedBlocks = new SynchronizedBlocks();

        IntStream.range(0, 1000)
                .forEach(count ->
                        service.submit(synchronizedBlocks::performSynchronisedTask));
        service.awaitTermination(100, TimeUnit.MILLISECONDS);

        assertEquals(1000, synchronizedBlocks.getCount());
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
