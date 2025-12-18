import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take integer input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Store original number for comparison later
        int originalNumber = number;

        // Initialize sum variable to store sum of cubes
        int sum = 0;

        // Loop until originalNumber becomes 0
        while (originalNumber != 0) {

            // Get last digit using modulus operator
            int digit = originalNumber % 10;

            // Find cube of digit and add to sum
            sum = sum + (digit * digit * digit);

            // Remove last digit by division
            originalNumber = originalNumber / 10;
        }

        // Compare sum with the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }
    }
}
