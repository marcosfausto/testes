package threads_test.callable_test;

public class SenderReceiver {
    private User user;

    // True if receiver should wait
    // False if sender should wait
    private boolean transfer = true;

    public synchronized User receive() {
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
        transfer = true;

        User returnPacket = user;
        notifyAll();
        return returnPacket;
    }

    public synchronized void send(User packet) {
        while (!transfer) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
        transfer = false;

        this.user = packet;
        notifyAll();
    }
}
