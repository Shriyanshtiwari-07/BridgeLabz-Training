import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a natural number.");
        } else {
            int factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        
    }
}
