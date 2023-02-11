package threads_test.callable_test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

public class ThreadTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //ExecutorService executor = Executors.newFixedThreadPool(2);
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        SenderReceiver senderReceiver = new SenderReceiver();
        Thread threadSendValue = new Thread(new ThreadSendValue(senderReceiver));
        ThreadGetValue threadGetValue = new ThreadGetValue(senderReceiver);


//        public void whenTaskSubmitted_ThenFutureResultObtained(){
//        }
//            FactorialTask task = new FactorialTask(5);
//            Future<Integer> future = executorService.submit(task);
//
//            assertEquals(120, future.get().intValue());

        executor.submit(threadSendValue);
        Future<User> future = executor.submit(threadGetValue);
        System.out.println(future.isDone());
        System.out.println(future.get());
        System.out.println(future.isDone());
        executor.shutdown();
//        threadSendValue.start();
//        threadGetValue.start();



    }


}
