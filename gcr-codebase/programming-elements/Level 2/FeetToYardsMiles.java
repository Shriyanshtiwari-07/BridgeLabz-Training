import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        double distanceInFeet;

        Scanner input = new Scanner(System.in);

        // Taking distance in feet from user
        distanceInFeet = input.nextDouble();

        // Conversions
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println(
            "The distance in yards is " + distanceInYards +
            " while the distance in miles is " + distanceInMiles
        );

        input.close();
    }
}
