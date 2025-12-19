import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite loop
        while (true) {

            System.out.print("Enter a number: ");
            double value = sc.nextDouble();

            // Break if zero or negative
            if (value <= 0) {
                break;
            }

            // Break if array is full
            if (index == 10) {
                break;
            }

            numbers[index] = value;
            index++;
        }

        // Calculate sum
        for (int i = 0; i < index; i++) {
            System.out.println("Value: " + numbers[i]);
            total = total + numbers[i];
        }

        System.out.println("Total sum = " + total);

        sc.close();
    }
}
