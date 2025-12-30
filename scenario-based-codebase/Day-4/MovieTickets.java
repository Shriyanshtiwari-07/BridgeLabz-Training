import java.util.Scanner;

public class MovieTicketBookingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueBooking = 'y';

        while (continueBooking == 'y' || continueBooking == 'Y') {

            int totalBill = 0;

            // Movie Type
            System.out.print("Enter movie type (Action / Comedy / Drama): ");
            String movieType = scanner.next();

            switch (movieType.toLowerCase()) {
                case "action":
                    totalBill = 200;
                    break;
                case "comedy":
                    totalBill = 180;
                    break;
                case "drama":
                    totalBill = 150;
                    break;
                default:
                    System.out.println("Invalid movie type. Booking cancelled.");
                    continue;
            }
            System.out.print("Enter seat type (Gold / Silver): ");
            String seatType = scanner.next();

            if (seatType.equalsIgnoreCase("gold")) {
                totalBill += 100;
            } else if (seatType.equalsIgnoreCase("silver")) {
                totalBill += 50;
            } else {
                System.out.println("Invalid seat type. Booking cancelled.");
                continue;
            }

            System.out.print("Do you want snacks? (yes / no): ");
            String snacks = scanner.next();

            if (snacks.equalsIgnoreCase("yes")) {
                totalBill += 80;
            }

            System.out.println("Total Ticket Price: ₹" + totalBill);
            System.out.print("Book ticket for next customer? (y/n): ");
            continueBooking = scanner.next().charAt(0);
        }

        System.out.println("Thank you for using Movie Ticket Booking App!");
        scanner.close();
    }
}
