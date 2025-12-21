import java.util.Scanner;

public class FindSumOfNaturalMethods{
	
    public static long sumOfNaturalRecursive(int number)
    {
	if(number <= 0)
	    return 0;
		
     	return number + sumOfNaturalRecursive(number-1);
    }

    public static void main(String args[])
    {
  	Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	
	long sumUsingRec = sumOfNaturalRecursive(number);
	long sumUsingFormulae = number*(number+1)/2;
	System.out.println("Sum of Naturals no. using Recursion: " + sumUsingRec);
	System.out.println("Sum of Naturals no. using Recursion: " + sumUsingFormulae);
	
    }
	
	
}