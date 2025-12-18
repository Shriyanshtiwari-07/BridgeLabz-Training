import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Read first number
        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        // Read second number
        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        // Read operator
        System.out.print("Enter operator (+, -, *, /): ");
        String op = input.next();

        // Perform operation using switch-case
        switch (op) {

            case "+":
                System.out.println("Result: " + (first + second));
                break;

            case "-":
                System.out.println("Result: " + (first - second));
                break;

            case "*":
                System.out.println("Result: " + (first * second));
                break;

            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
