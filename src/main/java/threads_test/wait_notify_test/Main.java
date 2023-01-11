package threads_test.wait_notify_test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Thread sender = new Thread(new Sender(data));
        Thread receiver = new Thread(new Receiver(data));
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(sender);
        executor.submit(receiver);
        executor.shutdown();

//        sender.start();
//        receiver.start();
    }
}
