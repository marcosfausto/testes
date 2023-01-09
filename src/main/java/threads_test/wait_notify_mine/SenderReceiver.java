package threads_test.wait_notify_mine;

import java.util.List;

public class SenderReceiver {
    private Integer userId;


    // True if receiver should wait
    // False if sender should wait
    private boolean transfer = true;

    public synchronized User receive(User user) {
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
        transfer = true;

        if (user.getId().equals(userId)) {
            notifyAll();
            return user;
        }
        notifyAll();
        return new User(-1,"unknow");
    }

    public synchronized void send(Integer packet) {
        while (!transfer) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
        transfer = false;

        this.userId = packet;
        notifyAll();
    }
}
