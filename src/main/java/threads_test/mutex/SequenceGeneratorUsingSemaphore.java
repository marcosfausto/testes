package threads_test.mutex;

import java.util.concurrent.Semaphore;

public class SequenceGeneratorUsingSemaphore extends SequenceGenerator {

    private Semaphore mutex = new Semaphore(1);

    @Override
    public int getNextSequence() {
        try {
            mutex.acquire();
            return super.getNextSequence();
        } catch (InterruptedException e) {
            // exception handling code
        } finally {
            mutex.release();
        }
        throw new RuntimeException("bla");
    }
}