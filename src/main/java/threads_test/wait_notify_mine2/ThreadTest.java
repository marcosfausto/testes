package threads_test.wait_notify_mine2;

import com.google.common.collect.Lists;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest {

    public static long now;
    public static void main(String[] args) {

        //ExecutorService executor = Executors.newFixedThreadPool(2);
        ExecutorService executor = Executors.newCachedThreadPool();
        User user1 = User.builder().id(1).nome("Frederico").build();
        User user2 = User.builder().id(2).nome("Gilmar").build();
        User user3 = User.builder().id(3).nome("Felipe").build();
        User user4 = User.builder().id(4).nome("Jorge").build();

       User user;
        List<User> userList = new ArrayList<>();
        now = System.currentTimeMillis();
        for(int i=1;i<=1000000;i++) {
            user = User.builder().id(i).build();
            userList.add(user);
//            if (i == 500000) {
//                System.out.println(userList);
//                ThreadSendValue threadSendValue = new ThreadSendValue(senderReceiver, userList);
//                Thread threadGetValue = new ThreadGetValue(senderReceiver, threadSendValue);
//                executor.submit(threadSendValue);
//                executor.submit(threadGetValue);
//                userList.clear();
//            } else if (i == 1000000) {
//                ThreadSendValue threadSendValue2 = new ThreadSendValue(senderReceiver, userList);
//                Thread threadGetValue2 = new ThreadGetValue(senderReceiver, threadSendValue2);
//                executor.submit(threadSendValue2);
//                executor.submit(threadGetValue2);
//            }
        }


//        List<User> firstList = userList.subList(0, userList.size() / 2);
//        List<User> secondList = userList.subList(userList.size() / 2 + 1, userList.size());
//
//        SenderReceiver senderReceiver = new SenderReceiver();
//        ThreadSendValue threadSendValue = new ThreadSendValue(senderReceiver, firstList);
//        Thread threadGetValue = new ThreadGetValue(senderReceiver, threadSendValue);
//
//        SenderReceiver senderReceiver2 = new SenderReceiver();
//        ThreadSendValue threadSendValue2 = new ThreadSendValue(senderReceiver2, secondList);
//        Thread threadGetValue2 = new ThreadGetValue(senderReceiver2, threadSendValue2);
//
//        executor.submit(threadSendValue);
//        executor.submit(threadGetValue);
//        executor.submit(threadSendValue2);
//        executor.submit(threadGetValue2);


        List<List<User>> partition = Lists.partition(userList, 500000);

        partition.forEach(list -> {
            SenderReceiver senderReceiver = new SenderReceiver();
            ThreadSendValue threadSendValue = new ThreadSendValue(senderReceiver, list);
            Thread threadGetValue = new ThreadGetValue(senderReceiver, threadSendValue);
            executor.submit(threadSendValue);
            executor.submit(threadGetValue);
        });


//        ThreadSendValue threadSendValue = new ThreadSendValue(senderReceiver, userList);
//        Thread threadGetValue = new ThreadGetValue(senderReceiver, threadSendValue);
//
//        executor.submit(threadSendValue);
//        executor.submit(threadGetValue);



        executor.shutdown();

//

//        threadSendValue.start();
//        threadGetValue.start();



    }


}
