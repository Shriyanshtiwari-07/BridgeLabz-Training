import java.util.Scanner;
import java.lang.Integer;

public class ConvertTextToLowecase
{
    public static String convertToLowercase(String text)   
    {	
	int size = text.length();
	String result = "";
	for(int i=0; i<size; i++)
	{
	    char ch = text.charAt(i);
	    
	    if(ch >= 'A' && ch <= 'Z')
	    {
		ch = (char)(ch + 32);
	    }
	    result += ch;
	}
	return result;
    } 
	
    public static boolean compare(String str1, String str2)
    {
	if(str1.length() != str2.length())
	    return false;
	for(int i=0; i<str1.length(); i++)
	{
	    if(str1.charAt(i) != str2.charAt(i))
	    	return false;
	}
	return true;
    }
	    
    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
	String text;
	System.out.print("Enter Text: ");
	text = input.nextLine();
	
	String userStr = convertToLowercase(text);
	String builtInStr = text.toLowerCase();
	boolean isSame = compare(text, builtInStr);
	
	System.out.print("Both the Strings " + builtInStr);
    }
}