import java.util.Scanner;
import java.lang.Integer;

public class ConvertTextToUppercase
{
    public static String convertToUppercase(String text)   
    {	
	int size = text.length();
	String result = "";
	for(int i=0; i<size; i++)
	{
	    char ch = text.charAt(i);
	    
	    if(ch >= 'a' && ch <= 'z')
	    {
		ch = (char)(ch - 32);
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
	
	String userStr = convertToUppercase(text);
	String builtInStr = text.toUpperCase();
	boolean isSame = compare(text, builtInStr);
	
	System.out.print("Both the Strings " + builtInStr);
    }
}