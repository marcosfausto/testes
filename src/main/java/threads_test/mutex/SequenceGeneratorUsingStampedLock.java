package threads_test.mutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;

public class SequenceGeneratorUsingStampedLock  extends SequenceGenerator{

    private StampedLock stampedLock = new StampedLock();
    private Lock writeLock = stampedLock.asWriteLock();
    @Override
    public int getNextSequence() {
        writeLock.lock();
        try {
            return super.getNextSequence();
        } finally {
            writeLock.unlock();
        }
    }
}