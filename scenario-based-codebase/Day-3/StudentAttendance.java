
import java.util.Scanner;

public class SchoolBusAttendance {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = {
            "Amit", "Vedansh", "Swaraj", "Ravi", "Rahul",
            "Pooja", "Ankit", "Sneha", "Vikas", "Shriyansh"
        };
        int presentCount = 0;
        int absentCount = 0;
		for (String name : students) {
            System.out.print("Is " + name + " Present or Absent? ");
            String status = sc.next();
            if (status.equalsIgnoreCase("Present")) {
                presentCount++;
            } else {
                absentCount++;
            }
        }
        System.out.println("\nTotal Present Students: " + presentCount);
        System.out.println("Total Absent Students: " + absentCount);
    }
}