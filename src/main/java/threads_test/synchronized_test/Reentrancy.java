package threads_test.synchronized_test;

public class Reentrancy {

    final Object lock = new Object();

    public void performSynchronisedTask() {
        synchronized (lock) {
            System.out.println("First time acquiring it");

            synchronized (lock) {
                System.out.println("Entering again");

                synchronized (lock) {
                    System.out.println("And again");
                }
            }
        }
    }

    public static void main(String[] args) {
        Reentrancy reentrancy = new Reentrancy();
        reentrancy.performSynchronisedTask();
    }

}
