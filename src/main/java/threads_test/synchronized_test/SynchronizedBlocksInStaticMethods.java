package threads_test.synchronized_test;

public class SynchronizedBlocksInStaticMethods {


    public static void main(String[] args) {
        synchronized (SynchronizedBlocksInStaticMethods.class) {
            System.out.println("shawblaw");
        }
    }


}
