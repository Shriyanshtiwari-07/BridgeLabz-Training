import java.util.Scanner;

public class CheckNumberPosNegMethods
{
    public static boolean isEven(int number)
    {
	if(number%2 == 0)
	    return true;
	else
	    return false;
    }
    
    public static int compare(int number1, int number2)
    {
	if(number1 > number2) 
  	    return 1;
	else if(number1 == number2)
	    return 0;
	else
	    return -1;
    }

    public static String isPositive(int number)
    {
	if(number > 0)
	{
	    boolean even = isEven(number);
	    if(even) return "Even";
	    else return "Odd";
	}	
	return "Negative";
    }

    public static void main(String args[])
    {
  	Scanner input = new Scanner(System.in);
	int[] arr = new int[5];
	for(int i=0; i<5; i++)
	{
	    System.out.print("Enter Number " + (i+1) + ": ");
	    arr[i] = input.nextInt();
	}	
	
	for(int i=0; i<5; i++)
	{
	    String result = isPositive(arr[i]);
	    System.out.println("Number " + (i+1) + " is " + (result));
	}	
	int isEqual = compare(arr[0], arr[4]);
 	if(isEqual == 1)
	    System.out.println(arr[0] + " is greater");
	else if(isEqual == -1)
	    System.out.println(arr[0] + " is lesser");
	else
	    System.out.println(arr[0] + "Both are equal");
    }
}