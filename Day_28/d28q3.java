import java.util.*;

class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSeats = 10;
        boolean[] seats = new boolean[totalSeats];

        while (true) {
            System.out.println("\n1. Book Ticket\n2. View Seats\n3. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter seat number (1-10): ");
                    int seat = sc.nextInt();
                    if (seat >= 1 && seat <= totalSeats && !seats[seat - 1]) {
                        seats[seat - 1] = true;
                        System.out.println("Seat " + seat + " booked!");
                    } else {
                        System.out.println("Invalid or already booked!");
                    }
                    break;
                case 2:
                    for (int i = 0; i < totalSeats; i++) {
                        System.out.println("Seat " + (i + 1) + ": " + (seats[i] ? "Booked" : "Available"));
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
