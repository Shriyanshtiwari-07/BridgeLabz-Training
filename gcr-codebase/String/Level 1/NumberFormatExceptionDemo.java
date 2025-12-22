import java.util.Scanner;
import java.lang.Integer;

public class  NumberFormatExceptionDemo
{
    public static void generateException(String str)   
    {	
	System.out.print(Integer.parseInt(str));
    } 
	
    public static void handleException(String str)
    {
	try
	{
	    System.out.print(Integer.parseInt(str));
	}
	catch(NumberFormatException e)
	{
	    System.out.println("NumberFormatException handled successfully!");	
	}
	
    }
    
    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
	String str;
	System.out.println("Enter String: ");
	str = input.nextLine();

	//System.out.println("Generating NumberFormatException:");
        //generateException(str);

        System.out.println("Handling NumberFormatException:");
        handleException(str);	
    }
}