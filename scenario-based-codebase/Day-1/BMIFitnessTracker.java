import java.util.Scanner;

public class BMIFitnessTracker {

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Taking weight input in kilograms
        System.out.print("Enter weight in kilograms: ");
        double weightInKg = scanner.nextDouble();

        // Taking height input in meters
        System.out.print("Enter height in meters: ");
        double heightInMeters = scanner.nextDouble();

        // Calculating BMI using the formula
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        // Displaying the calculated BMI
        System.out.println("Your BMI is: " + bmi);

        // Determining BMI category using if-else conditions
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } else {
            System.out.println("BMI Category: Overweight");
        }

        // Closing the scanner to prevent resource leak
        scanner.close();
    }
}
