import java.util.Scanner;
import java.lang.Integer;

public class ArrayIndexOutOfBoundsExceptionDemo
{
    public static void generateException(String[] arr)   
    {	
	int size = arr.length;
	System.out.print(arr[size]);
    } 
	
    public static void handleException(String[] arr)
    {
	try
	{
	    int size = arr.length;
	    System.out.print(arr[size]);	    
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	    System.out.println("ArrayIndexOutOfBoundsException handled successfully!");	
	}
	
    }
    
    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
	String[] arr = new String[5];
	for(int i=0; i<5; i++)
	{
	    System.out.print("Enter Username: ");
	    arr[i] = input.nextLine();
	}

	//System.out.println("Generating ArrayIndexOutOfBoundsException:");
        //generateException(arr);

        System.out.println("Handling ArrayIndexOutOfBoundsException:");
        handleException(arr);	
    }
}