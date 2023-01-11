package threads_test.callable_test;

import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadSendValue implements Runnable {
    // initiated run method for Thread

    private SenderReceiver senderReceiver;

    public ThreadSendValue(SenderReceiver senderReceiver) {
        this.senderReceiver = senderReceiver;
    }
    @Override
    public void run() {

        System.out.println("ThreadSendValue Running..." + Thread.currentThread().getName());
        User user1 = User.builder().id(1).nome("Frederico").build();
            senderReceiver.send(user1);

            // Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
    }

}
