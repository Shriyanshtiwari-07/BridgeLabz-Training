import java.util.*;

public class CheckPalindromeExtras
{
    public static boolean CheckPalindrome(String text, int i, int j)
    {
        if(i >= j)
	    return true;
        if(text.charAt(i) != text.charAt(j))
	    return false;
    	return CheckPalindrome(text, i+1, j-1);
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String text = input.next();

	boolean isPalin = CheckPalindrome(text, 0, text.length()-1);
	if(isPalin)
	    System.out.print("String is Palindrome");
	else
	    System.out.print("String is not Palindrome");        
    }
}