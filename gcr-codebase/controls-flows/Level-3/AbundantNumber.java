import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take integer input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize sum of divisors
        int sum = 0;

        // Loop through all numbers less than input number
        for (int i = 1; i < number; i++) {

            // Check if i is a divisor
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        // Check if number is abundant
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is not an Abundant Number");
        }
    }
}
