import java.util.Scanner;

public class SumOfNaturalNumbersFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if (n >= 0) {   
		// Natural number check (including 0)

            // Formula computation
            int formulaSum = n * (n + 1) / 2;

            // For loop computation
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum = loopSum + i;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Result is correct. Both computations match.");
            } else {
                System.out.println("Result is incorrect. Computations do not match.");
            }

        } else {
           System.out.println("The number " + n + " is not a natural number");
        }

        
    }
}
