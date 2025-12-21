import java.util.Scanner;

public class IsLeapYearMethods
{
    public static boolean findIsLeapYear(int year)
    {
	if(year >= 1582 && year <= 2025)
	{	
	    if(year%400 == 0 || (year % 4 == 0 && year % 100 != 0))
	    	return true;
	}
	return false;
    }
	
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int year;
	System.out.print("Enter Year: ");
	year = input.nextInt();
	
	boolean isLeap = findIsLeapYear(year);
	if(isLeap)
	{
	    System.out.println("Leap Year");
	}
	else
	{
	    System.out.println("Not a Leap Year Or Not a valid year for leap year conditions");
	}
    }
}