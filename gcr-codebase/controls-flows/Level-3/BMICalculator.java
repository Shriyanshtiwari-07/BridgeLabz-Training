import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take weight input in kilograms
        System.out.print("Enter weight (in kg): ");
        double weight = input.nextDouble();

        // Take height input in centimeters
        System.out.print("Enter height (in cm): ");
        double heightCm = input.nextDouble();

        // Convert height from cm to meters
        double heightMeter = heightCm / 100;

        // Calculate BMI using formula
        double bmi = weight / (heightMeter * heightMeter);

        // Display BMI value
        System.out.println("BMI Value: " + bmi);

        // Determine BMI category
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Weight Status: Normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }
    }
}
