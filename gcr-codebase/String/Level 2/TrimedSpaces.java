import java.util.Scanner;

public class TrimedSpaces
{   	
    public static int trimLeadingSpaces(String text)
    {
	int size = text.length();
	int idx = 0;
	for(int i=0; i<size;  i++)
	{
	    if(text.charAt(i) != ' ')
	    {
		idx = i;
		break;
	    }	
	}
	return idx;
    }
	
    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
	String text;
	System.out.print("Enter String: ");
	text = input.nextLine();
	int size = text.length();
	int idx = trimLeadingSpaces(text);
	text = text.substring(idx, size);
	System.out.print("After Trim Leading Spaces:" + text);
    }
}