package threads_test.wait_notify_mine2;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadSendValue extends Thread {
    // initiated run method for Thread

    private SenderReceiver senderReceiver;
    private List<User> userList;

    public ThreadSendValue(SenderReceiver senderReceiver, List<User> userList) {
        this.senderReceiver = senderReceiver;
        this.userList = userList;
    }
    @Override
    public void run() {

        System.out.println("ThreadSendValue Running..." + Thread.currentThread().getName());

        for (User user : userList) {
            senderReceiver.send(user);

            // Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
    }

    public List<User> getUserList() {
        return userList;
    }
}
