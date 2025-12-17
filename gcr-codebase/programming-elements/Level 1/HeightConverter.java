import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        double heightCm;

        Scanner input = new Scanner(System.in);

        // Taking height in centimeters from user
        heightCm = input.nextDouble();

        // Conversion
        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println(
            "Your Height in cm is " + heightCm +
            " while in feet is " + feet +
            " and inches is " + inches
        );

        input.close();
    }
}
