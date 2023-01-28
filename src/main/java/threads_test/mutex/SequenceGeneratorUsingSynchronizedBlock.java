package threads_test.mutex;

public class SequenceGeneratorUsingSynchronizedBlock extends SequenceGenerator {

    @Override
    public int getNextSequence() {
        synchronized (this) {
            return super.getNextSequence();
        }
    }



}