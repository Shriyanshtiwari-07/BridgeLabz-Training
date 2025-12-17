import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        double base;
        double height;

        Scanner input = new Scanner(System.in);

        // Taking user input in centimeters
        base = input.nextDouble();
        height = input.nextDouble();

        // Area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // Conversion: 1 inch = 2.54 cm → 1 sq in = (2.54)^2 sq cm
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        System.out.println(
            "The Area of the triangle in sq in is " + areaSqIn +
            " and sq cm is " + areaSqCm
        );

        input.close();
    }
}
