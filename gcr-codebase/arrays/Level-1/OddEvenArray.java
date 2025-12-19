import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check for Natural Number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number.");
            return;
        }

        // Create arrays
        int[] evenArray = new int[number / 2 + 1];
        int[] oddArray = new int[number / 2 + 1];

        // Index variables
        int evenIndex = 0;
        int oddIndex = 0;

        // Store odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenArray[evenIndex] = i;
                evenIndex++;
            } else {
                oddArray[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print odd numbers
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArray[i] + " ");
        }

        // Print even numbers
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenArray[i] + " ");
        }

        sc.close();
    }
}
