import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        double perimeter;

        Scanner input = new Scanner(System.in);

        // Taking perimeter input from user
        perimeter = input.nextDouble();

        // Perimeter = 4 × side
        double side = perimeter / 4;

        System.out.println(
            "The length of the side is " + side +
            " whose perimeter is " + perimeter
        );

        input.close();
    }
}
