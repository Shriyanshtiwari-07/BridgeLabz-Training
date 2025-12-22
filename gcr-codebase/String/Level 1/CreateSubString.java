import java.util.Scanner;

public class CreateSubString
{
    public static String createSubString(String str, int strtIdx, int endIdx)   
    {
	int size = str.length();
	String resultString = "";
        for(int i = strtIdx; i <= endIdx; i++)	
	{
	    resultString += str.charAt(i);
	}
	return resultString;
    } 

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	String str;
	System.out.print("Enter String: ");
	str = input.nextLine();
	int strtIdx, endIdx;
	System.out.print("Enter Start index: ");
	strtIdx = input.nextInt();
	System.out.print("Enter End index: ");
	endIdx = input.nextInt();
	
	String resultString = createSubString(str, strtIdx, endIdx);
	String resSubString = str.substring(strtIdx, endIdx+1);
	if(resultString.equals(resSubString))
	{ 
            System.out.println("Both Strings are equal");
	    System.out.print("SubString is: " + resultString);
        }
	else
	    System.out.print("Both Strings are not equal");

	input.close();
    }
}