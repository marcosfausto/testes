package threads_test.wait_notify_mine;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class ThreadGetValue extends Thread {

    private SenderReceiver senderReceiver;
    private List<User> userList;
    private Set<Integer> ids;

    public ThreadGetValue(SenderReceiver senderReceiver,Set<Integer> ids,List<User> userList) {
        this.senderReceiver = senderReceiver;
        this.ids = ids;
        this.userList = userList;
    }

    @Override
    public void run() {
        System.out.println("ThreadGetValue Running..." + Thread.currentThread().getName());

        List<User> newList = userList.stream().filter(u -> ids.contains(u.getId())).collect(Collectors.toList());

        newList.forEach(u -> System.out.println(senderReceiver.receive(u)));

        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread Interrupted");
        }
    }

}


