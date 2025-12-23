import java.util.Scanner;
import java.lang.Integer;

public class ReturnLength
{
    public static int returnLengthOfString(String text)   
    {	
	int lenCount = 0;
	try
	{
	    while(true)
	    {	
	        text.charAt(lenCount);
	        lenCount++;
	    }		
	}
	catch(StringIndexOutOfBoundsException e)
	{
	    return lenCount;
	}	
    } 
		    
    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
	String text;
	System.out.print("Enter Text: ");
	text = input.next();
	
	int len = returnLengthOfString(text);
	System.out.print("String Length is: " + len);
		
    }
}