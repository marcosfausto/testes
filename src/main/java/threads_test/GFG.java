package threads_test;


public class GFG implements Runnable {
    // method to start Thread
    public void run()
    {
        System.out.println(
                "Thread is Running Successfully " + Thread.currentThread().getName());
    }

    public static void main(String[] args)
    {
        GFG g1 = new GFG();
        // initializing Thread Object
        Thread t1 = new Thread(g1);
        t1.run();
        t1.start();

    }
}
