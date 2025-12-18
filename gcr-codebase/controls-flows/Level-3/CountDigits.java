import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take integer input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize count variable
        int count = 0;

        // Handle case when number is 0
        if (number == 0) {
            count = 1;
        } else {

            // Loop until number becomes 0
            while (number != 0) {

                // Remove last digit
                number = number / 10;

                // Increase digit count
                count++;
            }
        }

        // Display number of digits
        System.out.println("Number of digits: " + count);
    }
}
