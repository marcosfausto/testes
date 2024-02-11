package threads_test.daemon_test;

public class DaemonTest {
    public static void main(String[] args) {
        Thread daemon = new Thread(()
                -> System.out.println("Hello from daemon!"));
        daemon.setDaemon(true);
        daemon.start();

    }
}
