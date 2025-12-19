import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Declare array
        int[] numbers = new int[5];

        // Step 2: Take input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Step 3: Check each number
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {

                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is positive and even");
                } else {
                    System.out.println(numbers[i] + " is positive and odd");
                }

            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative");
            } else {
                System.out.println(numbers[i] + " is zero");
            }
        }

        // Step 4: Compare first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("First and last elements are equal");
        } else if (first > last) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("First element is less than last element");
        }

        sc.close();
    }
}
