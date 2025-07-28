package day8;

class TicketRunnable implements Runnable {
    static int tickets = 5;  // Shared tickets
    String user;
    int ticketsToBook;

    TicketRunnable(String user, int ticketsToBook) {
        this.user = user;
        this.ticketsToBook = ticketsToBook;
    }

    public void run() {
        try {
            if (tickets >= ticketsToBook) {
                System.out.println(user + " booked " + ticketsToBook + " ticket(s).");
                tickets -= ticketsToBook;
                System.out.println("Tickets left: " + tickets);
            } else {
                throw new Exception("Not enough tickets for " + user);
            }
        } catch (Exception e) {
            System.out.println(user + " failed to book: " + e.getMessage());
        }
    }
}

public class RunnableBooking {
    public static void main(String[] args) {
        // Create Runnable objects
        Runnable r1 = new TicketRunnable("Alice", 2);
        Runnable r2 = new TicketRunnable("Bob", 2);
        Runnable r3 = new TicketRunnable("Charlie", 2);  // May fail

        // Create threads and start
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();
    }
}

