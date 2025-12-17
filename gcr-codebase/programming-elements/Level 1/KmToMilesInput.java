import java.util.Scanner;

public class KmToMilesInput {
    public static void main(String[] args) {
        double km;
        double miles;

        Scanner input = new Scanner(System.in);

        // Taking input from user
        km = input.nextInt();

        // Conversion formula: 1 mile = 1.6 km
        miles = km / 1.6;

        System.out.println(
            "The total miles is " + miles + " mile for the given " + km + " km"
        );

        input.close();
    }
}
