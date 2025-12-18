import java.util.Scanner;

public class GreatestFactorFor {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Read number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize greatest factor as 1
        int greatestFactor = 1;

        // Loop from number-1 down to 1
        for (int i = number - 1; i >= 1; i--) {

            // Check divisibility
            if (number % i == 0) {
                greatestFactor = i;
                break; // Exit loop after finding first greatest factor
            }
        }

        // Display result
        System.out.println("Greatest factor excluding itself: " + greatestFactor);
    }
}
