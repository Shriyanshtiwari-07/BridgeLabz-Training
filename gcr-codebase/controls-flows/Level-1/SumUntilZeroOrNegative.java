import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        while (true) {   
            System.out.print("Enter a number : ");
            double value = sc.nextDouble();

            if (value <= 0) {
                break;
            }

            total = total + value;
        }

        System.out.println("Total sum is: " + total);

        sc.close();
    }
}
