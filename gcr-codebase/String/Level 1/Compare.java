import java.util.Scanner;

public class Compare
{
    public static boolean compareStrings(String str1, String str2)   
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
	String str1, str2;
	System.out.print("Enter String first: ");
	str1 = input.nextLine();
	System.out.print("Enter String second: ");
	str2 = input.nextLine();
	
	boolean isSame = compareStrings(str1, str2);
	if(isSame)
	{
	    System.out.println("Both Strings are equal using method");
	    if(str1.equals(str2))
		System.out.println("Both Strings are equal using equal()");
	}
	else
	    System.out.print("Both Strings are not equal");
	
	input.close();
    }
}