package threads_test.wait_notify_mine2;

import java.util.Arrays;

public class ThreadTest {

    public static void main(String[] args) {

        //ExecutorService executor = Executors.newFixedThreadPool(10);
        SenderReceiver senderReceiver = new SenderReceiver();
        User user1 = User.builder().id(1).nome("Frederico").build();
        User user2 = User.builder().id(2).nome("Gilmar").build();
        User user3 = User.builder().id(3).nome("Felipe").build();
        User user4 = User.builder().id(4).nome("Jorge").build();

        ThreadSendValue threadSendValue = new ThreadSendValue(senderReceiver, Arrays.asList(user1,user2,user3,user4));
        Thread threadGetValue = new ThreadGetValue(senderReceiver, threadSendValue);

//        executor.submit(threadGetValue);
//        executor.submit(gfgExtendsThread);
        threadSendValue.start();
        threadGetValue.start();



    }


}
