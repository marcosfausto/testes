package threads_test;

public class RunnableTest {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("runnn");
            }
        };
        thread.start();

        Thread thread2 = new Thread(() -> System.out.println("runnn2"));
        thread2.start();
    }
}
