import java.util.Scanner;

public class PhoneRechargeSimulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 0;   // Initial balance
        char choice;

        do {
            // Taking operator input
            System.out.println("Enter your mobile operator:");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. Vi");
            int operator = sc.nextInt();

            // Taking recharge amount
            System.out.print("Enter recharge amount: ");
            double amount = sc.nextDouble();

            // Adding amount to balance
            balance = balance + amount;

            // Showing offers using switch
            switch (operator) {
                case 1:
                    System.out.println("Jio Offer: 1.5GB/day for 28 days");
                    break;

                case 2:
                    System.out.println("Airtel Offer: Unlimited calls + 2GB/day");
                    break;

                case 3:
                    System.out.println("Vi Offer: Weekend data rollover");
                    break;

                default:
                    System.out.println("Invalid operator selected");
            }

            // Showing current balance
            System.out.println("Recharge successful!");
            System.out.println("Current Balance: ₹" + balance);

            // Asking for another recharge
            System.out.print("Do you want to recharge again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using Phone Recharge Simulator");
        sc.close();
    }
}
