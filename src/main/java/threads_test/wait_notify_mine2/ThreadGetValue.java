package threads_test.wait_notify_mine2;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadGetValue extends Thread {

    private SenderReceiver senderReceiver;
    private ThreadSendValue threadSendValue;

    public ThreadGetValue(SenderReceiver senderReceiver, ThreadSendValue threadSendValue) {
        this.senderReceiver = senderReceiver;
        this.threadSendValue = threadSendValue;
    }

    @Override
    public void run() {
        System.out.println("ThreadGetValue Running..." + Thread.currentThread().getName());

        threadSendValue.getUserList().forEach(user -> System.out.println("Recebido: " + senderReceiver.receive().getNome()));

        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread Interrupted");
        }
    }

}


