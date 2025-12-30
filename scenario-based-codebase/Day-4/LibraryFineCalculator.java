import java.util.Scanner;

public class LibraryFineCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalFine = 0;

        for (int bookCount = 1; bookCount <= 5; bookCount++) {

            System.out.println("\nBook " + bookCount);

            System.out.print("Enter due date (day number): ");
            int dueDate = scanner.nextInt();

            System.out.print("Enter return date (day number): ");
            int returnDate = scanner.nextInt();

            int lateDays = returnDate - dueDate;
            int fine = 0;

            if (lateDays > 0) {
                fine = lateDays * 5;
                System.out.println("Late by " + lateDays + " days");
            } else {
                System.out.println("Returned on time");
            }

            System.out.println("Fine for this book: ₹" + fine);
            totalFine += fine;
        }

        System.out.println("\nTotal Fine for all books: ₹" + totalFine);
        scanner.close();
    }
}
