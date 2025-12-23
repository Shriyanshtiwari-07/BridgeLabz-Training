import java.util.Scanner;

public class CharTypes
{   	
    public static String[][] defineTypeToChar(String text)
    {
	int vowels = 0, consonants = 0;
	int size = text.length();
	text = text.toLowerCase();
	String[][] letter = new String[size][2];
	for(int i=0; i<size; i++)
	{
	    char ch = text.charAt(i);
	    String type = "";
	    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	    {
		type = "vowel";
	    }
	    else if((ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' 
	    || ch != 'u') && (ch > 'a' && ch <= 'z'))
	    {
		type = "consonants";
	    }
	    else
		type = "Not a Letter";
	    letter[i][0] = String.valueOf(ch);
	    letter[i][1] = type;
	}
	return letter;
    }
	
    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
	String text;
	System.out.print("Enter String: ");
	text = input.nextLine();
	int size = text.length();
	
	String[][] letter = defineTypeToChar(text);
	for(int i=0; i<size; i++)
	{
	    System.out.println(letter[i][0] + " is " + letter[i][1]);
	}		
    }
}