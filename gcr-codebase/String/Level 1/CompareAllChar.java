import java.util.Scanner;

public class CompareAllChar
{
    public static char[] createArrayOfString(String str)   
    {
	int size = str.length();	
	char[] strArr = new char[size];
	
        for(int i = 0; i < size; i++)	
	{
	    strArr[i] = str.charAt(i);	    
	}
	return strArr;
    } 
    
    public static boolean compareTwoArray(char[] arr1, char[] arr2)
    {
	if(arr1.length != arr2.length)
	    return false;
	for(int i=0; i<arr1.length; i++)
	{
	    if(arr1[i] != arr2[i])
		return false;
	}
	return true;
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	String str;
	System.out.print("Enter String: ");
	str = input.nextLine();
	
	char[] userArr = createArrayOfString(str);
	char[] builtInArr = str.toCharArray();

	boolean result = compareTwoArray(userArr, builtInArr);
	
	System.out.print("Both are equal, return same result: " + result);

	input.close();
    }
}