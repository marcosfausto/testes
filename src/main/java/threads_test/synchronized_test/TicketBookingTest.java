package threads_test.synchronized_test;

public class TicketBookingTest {

    public static void main(String[] args) {
        TicketCounter tc = new TicketCounter();
        TicketBookingThread t1 = new TicketBookingThread(tc, "Adithya", 2);
        TicketBookingThread t2 = new TicketBookingThread(tc, "Jai", 2);
        t1.start();
        t2.start();
    }

}




