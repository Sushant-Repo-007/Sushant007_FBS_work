import java.util.Scanner;

// Custom Exception 1
class InvalidTicketNumberException extends Exception {
    public InvalidTicketNumberException(String message) {
        super(message);
    }
}

// Custom Exception 2
class TicketsSoldOutException extends Exception {
    public TicketsSoldOutException(String message) {
        super(message);
    }
}

class MovieBooking {

    static String movieName = "3 Idiots";
    static int ticketPrice = 200;
    static int remainingTickets = 50;

    public static void bookTickets(int numberOfTickets)
            throws InvalidTicketNumberException, TicketsSoldOutException {

        if (numberOfTickets <= 0) {
            throw new InvalidTicketNumberException(
                    "Number of tickets must be greater than 0.");
        }

        if (remainingTickets == 0) {
            throw new TicketsSoldOutException(
                    "Sorry! Tickets are sold out.");
        }

        if (numberOfTickets > remainingTickets) {
            throw new TicketsSoldOutException(
                    "Only " + remainingTickets + " tickets available.");
        }

        remainingTickets -= numberOfTickets;

        int totalAmount = numberOfTickets * ticketPrice;

        System.out.println("\nBooking Successful for \"" + movieName + "\"!");
        System.out.println("Tickets booked: " + numberOfTickets);
        System.out.println("Total amount: ₹" + totalAmount);
        System.out.println("Remaining Tickets: " + remainingTickets);
    }
}

public class MovieTicketBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            try {

                if (MovieBooking.remainingTickets == 0) {
                    throw new TicketsSoldOutException(
                            "Sorry! Tickets are sold out.");
                }

                System.out.println("\nRemaining Tickets: "
                        + MovieBooking.remainingTickets);

                System.out.print("Enter number of tickets to book: ");
                int tickets = sc.nextInt();
                
                
                MovieBooking Mb= new MovieBooking();

                Mb.bookTickets(tickets);

            } catch (InvalidTicketNumberException e) {

                System.out.println("Error: " + e.getMessage());

            } catch (TicketsSoldOutException e) {

                System.out.println(e.getMessage());
                break;

            } catch (Exception e) {

                System.out.println("Invalid Input! Please enter a number.");
                sc.nextLine();

            }
        }

        sc.close();
    }
}