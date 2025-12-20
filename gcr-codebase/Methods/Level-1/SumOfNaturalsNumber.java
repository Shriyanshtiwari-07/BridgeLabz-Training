import java.util.Scanner;

public class SumOfNaturalsNumber
{
    long calcSum(int number)
    {
	long sum = 0;
	for(int i=1; i<=number; i++)
	{
	    sum += i;
	}
	return sum;
    }

    public static void main(String args[])
    {
  	Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	SumOfNaturalsNumber obj = new SumOfNaturalsNumber();
	long result = obj.calcSum(number);
	System.out.print("The Sum of " + number + " Naturals number is: " + result);
	
    }
}