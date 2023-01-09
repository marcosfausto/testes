package threads_test.wait_notify_mine;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadSendValue extends Thread {
    // initiated run method for Thread

    private SenderReceiver senderReceiver;
    private Set<Integer> usersIdList;

    public ThreadSendValue(SenderReceiver senderReceiver,Set<Integer> usersIdList) {
        this.senderReceiver = senderReceiver;
        this.usersIdList = usersIdList;
    }
    @Override
    public void run() {

        System.out.println("ThreadSendValue Running..." + Thread.currentThread().getName());

        for (Integer id : usersIdList) {
            senderReceiver.send(id);

            // Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
    }

    public Set<Integer> getUsersIdList() {
        return usersIdList;
    }
}
