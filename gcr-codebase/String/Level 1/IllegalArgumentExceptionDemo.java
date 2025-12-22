import java.util.Scanner;

public class IllegalArgumentExceptionDemo
{
    public static void generateException(String str)   
    {	
	int strtIdx = 1;
	int endIdx = 0;
	System.out.print(str.substring(strtIdx, endIdx));
    } 
	
    public static void handleException(String str)
    {
	int strtIdx = 1;
	int endIdx = 0;
	try
	{
	    System.out.print(str.substring(strtIdx, endIdx));
	}
	catch(IllegalArgumentException e)
	{
	    System.out.println("IllegalArgumentException handled successfully!");	
	}
	
    }
    
    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
	String str;
	System.out.println("Enter String: ");
	str = input.nextLine();

	//System.out.println("Generating IllegalArgumentException:");
        //generateException(str);

        System.out.println("Handling IllegalArgumentException:");
        handleException(str);	
    }
}