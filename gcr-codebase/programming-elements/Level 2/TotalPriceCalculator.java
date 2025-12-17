import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        double unitPrice;
        int quantity;

        Scanner input = new Scanner(System.in);

        // Taking user input
        unitPrice = input.nextDouble();
        quantity = input.nextInt();

        // Calculation
        double totalPrice = unitPrice * quantity;

        System.out.println(
            "The total purchase price is INR " + totalPrice +
            " if the quantity " + quantity +
            " and unit price is INR " + unitPrice
        );

        input.close();
    }
}
