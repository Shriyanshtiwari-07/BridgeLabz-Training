import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter date (yyyy-mm-dd): ");
        String dateInput = input.nextLine();

        LocalDate date = LocalDate.parse(dateInput);

        // Add 7 days
        date = date.plusDays(7);

        // Add 1 month
        date = date.plusMonths(1);

        // Add 2 years
        date = date.plusYears(2);

        // Subtract 3 weeks
        date = date.minusWeeks(3);

        System.out.println("Final Date after calculations: " + date);
    }
}