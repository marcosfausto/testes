package threads_test.synchronized_test;

public class TicketBookingThread extends Thread {
    final TicketCounter tc;
    String name;
    int seats;

    TicketBookingThread(TicketCounter tc, String name, int seats) {
        this.tc = tc;
        this.name = name;
        this.seats = seats;
    }

    public void run() {
        synchronized (tc) { // synchronized block
            tc.bookTicket(name, seats);
        }
    }
}
