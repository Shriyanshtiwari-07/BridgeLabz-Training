import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Read number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number > 0) {

            // Counter variable initialization
            int counter = 1;

            System.out.println("Factors of " + number + ":");

            // Loop till counter is less than the number
            while (counter < number) {

                // Check if number is perfectly divisible
                if (number % counter == 0) {
                    System.out.println(counter);
                }

                // Increment counter
                counter++;
            }

        } else {
            System.out.println("Please enter a positive integer");
        }
    }
}
