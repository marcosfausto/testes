package threads_test.mutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SequenceGeneratorUsingReentrantReadWriteLock extends SequenceGenerator{

    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private Lock writeLock = readWriteLock.writeLock();
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
