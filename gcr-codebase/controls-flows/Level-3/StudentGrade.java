import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Read marks
        System.out.print("Enter Physics marks: ");
        int physics = input.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = input.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = input.nextInt();

        // Calculate average percentage
        double percentage = (physics + chemistry + maths) / 3.0;

        // Display percentage
        System.out.println("Average Percentage: " + percentage);

        // Determine grade and remarks
        if (percentage >= 75) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Excellent");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Very Good");
        } else if (percentage >= 50) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Good");
        } else if (percentage >= 40) {
            System.out.println("Grade: D");
            System.out.println("Remarks: Pass");
        } else {
            System.out.println("Grade: F");
            System.out.println("Remarks: Fail");
        }
    }
}
