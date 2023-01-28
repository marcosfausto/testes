package threads_test.synchronized_test;

public class TicketCounter {
    int availableSeats = 2;

    void bookTicket(String name, int numberOfSeats) {
        if ((availableSeats >= numberOfSeats) && (numberOfSeats > 0)) {
            System.out.println(name + " : " + numberOfSeats + " Seats Booking Success");
            availableSeats -= numberOfSeats;
        } else {
            System.out.println(name + " : Seats Not Available");
        }
    }
}
