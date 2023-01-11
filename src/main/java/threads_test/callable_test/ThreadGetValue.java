package threads_test.callable_test;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadGetValue implements Callable<User> {

    private SenderReceiver senderReceiver;
    public ThreadGetValue(SenderReceiver senderReceiver) {
        this.senderReceiver = senderReceiver;
    }


    @Override
    public User call() throws RuntimeException{
        System.out.println("ThreadGetValue Running..." + Thread.currentThread().getName());

        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread Interrupted");
        }
//        if(senderReceiver.receive()==null){
//            throw new RuntimeException("Usuário nulo recebido!");
//        }
        return senderReceiver.receive();
    }
}


