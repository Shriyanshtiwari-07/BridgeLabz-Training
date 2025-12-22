import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo
{
    public static void generateException(String str)   
    {	
	int size = str.length();
	System.out.print(str.charAt(size));
    } 
	
    public static void handleException(String str)
    {
	int size = str.length();
	try
	{
	    System.out.print(str.charAt(size));
	}
	catch(StringIndexOutOfBoundsException e)
	{
	    System.out.println("StringIndexOutOfBoundsException handled successfully!");	
	}
	
    }
    
    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
	String str;
	System.out.println("Enter String: ");
	str = input.nextLine();

	System.out.println("Generating StringIndexOutOfBoundsException:");
        generateException(str);

        System.out.println("Handling StringIndexOutOfBoundsException:");
        handleException(str);	
    }
}