package threads_test.wait_notify_mine;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        SenderReceiver senderReceiver = new SenderReceiver();
        User user1 = User.builder().id(1).nome("Frederico").build();
        User user2 = User.builder().id(2).nome("Gilmar").build();
        User user3 = User.builder().id(3).nome("Felipe").build();
        User user4 = User.builder().id(4).nome("Jorge").build();

        Set<Integer> ids = new HashSet<>(Arrays.asList(1,3));

        Thread threadSendValue = new ThreadSendValue(senderReceiver,ids);
        Thread threadGetValue = new ThreadGetValue(senderReceiver,ids,Arrays.asList(user1,user2,user3,user4));

        executor.submit(threadSendValue);
        executor.submit(threadGetValue);
        executor.shutdown();
        
//        threadSendValue.start();
//        threadGetValue.start();



    }


}
