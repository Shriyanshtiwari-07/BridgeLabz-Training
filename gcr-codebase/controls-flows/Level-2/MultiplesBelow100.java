import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Read number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is positive and less than 100
        if (number > 0 && number < 100) {

            System.out.println("Multiples of " + number + " below 100:");

            // Loop backward from 100 to 1
            for (int i = 100; i >= 1; i--) {

                // Check if i is a multiple of number
                if (i % number == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Enter a positive number less than 100");
        }
    }
}
