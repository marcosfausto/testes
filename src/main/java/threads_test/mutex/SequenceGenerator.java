package threads_test.mutex;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SequenceGenerator {

    private int currentValue = 0;


    // invoking this without synchronized it will die
    public int getNextSequence() {
        currentValue = currentValue + 1;
        return currentValue;
    }

    @Test
    public void givenUnsafeSequenceGenerator_whenRaceCondition_thenUnexpectedBehavior() throws Exception {
        int count = 100000;
        Set<Integer> uniqueSequences = getUniqueSequences(new SequenceGeneratorUsingStampedLock(), count);
        assertEquals(count, uniqueSequences.size());
    }

    private Set<Integer> getUniqueSequences(SequenceGenerator generator, int count) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Set<Integer> uniqueSequences = new LinkedHashSet<>();
        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 0; i < count; i++) {
         //   futures.add(executor.submit(() -> generator.getNextSequence()));
            futures.add(executor.submit(generator::getNextSequence));
        }

        for (Future<Integer> future : futures) {
            uniqueSequences.add(future.get());
        }

        executor.awaitTermination(1, TimeUnit.SECONDS);
        executor.shutdown();

        return uniqueSequences;
    }

}