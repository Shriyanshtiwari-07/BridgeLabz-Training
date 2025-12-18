import java.util.Scanner;

public class FriendComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age and height: ");
        int ageA = sc.nextInt();
        int heightA = sc.nextInt();

        System.out.print("Enter Akbar's age and height: ");
        int ageB = sc.nextInt();
        int heightB = sc.nextInt();

        System.out.print("Enter Anthony's age and height: ");
        int ageC = sc.nextInt();
        int heightC = sc.nextInt();

        // Youngest
        if (ageA <= ageB && ageA <= ageC)
            System.out.println("Amar is the youngest");
        else if (ageB <= ageA && ageB <= ageC)
            System.out.println("Akbar is the youngest");
        else
            System.out.println("Anthony is the youngest");

        // Tallest
        if (heightA >= heightB && heightA >= heightC)
            System.out.println("Amar is the tallest");
        else if (heightB >= heightA && heightB >= heightC)
            System.out.println("Akbar is the tallest");
        else
            System.out.println("Anthony is the tallest");
    }
}
