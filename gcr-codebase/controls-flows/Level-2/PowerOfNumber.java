import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Read base number
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Read power value
        System.out.print("Enter power: ");
        int power = input.nextInt();

        // Check for positive integers
        if (number > 0 && power > 0) {

            // Initialize result as 1
            int result = 1;

            // Loop to calculate power
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            // Display final result
            System.out.println(number + " raised to the power " + power + " is: " + result);

        } else {
            System.out.println("Please enter positive integers only");
        }
    }
}
