import java.util.Scanner;

public class CheckPrimeNumber
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();
	
	boolean isPrime = true;
	
	for(int strt = 1; strt <= number; strt++)
	{
	    if(number%strt == 0 && strt != 1 && strt != number)
	    {
	        isPrime = false;
		break;
	    }
	}
	if(isPrime)
	{
	    System.out.println("The Number is Prime");
	}
	else
	{
	    System.out.println("The Number is Not Prime");
	}
    }
}
