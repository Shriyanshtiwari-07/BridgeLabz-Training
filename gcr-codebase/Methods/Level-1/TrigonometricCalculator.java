import java.util.Scanner;

public class TrigonometricCalculator {

    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate trigonometric values
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return results as an array
        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter angle in degrees:");
        double angle = sc.nextDouble();

        double[] result = calculateTrigonometricFunctions(angle);

        System.out.println("Sine value = " + result[0]);
        System.out.println("Cosine value = " + result[1]);
        System.out.println("Tangent value = " + result[2]);

        sc.close();
    }
}
