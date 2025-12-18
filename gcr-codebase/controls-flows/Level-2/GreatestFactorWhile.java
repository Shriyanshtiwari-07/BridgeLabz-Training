import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Read number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize greatest factor as 1
        int greatestFactor = 1;

        // Initialize counter from number - 1
        int counter = number - 1;

        // Loop until counter reaches 1
        while (counter >= 1) {

            // Check if number is divisible by counter
            if (number % counter == 0) {
                greatestFactor = counter;
                break; // Exit loop once found
            }

            // Decrement counter
            counter--;
        }

        // Display result
        System.out.println("Greatest factor excluding itself: " + greatestFactor);
    }
}
