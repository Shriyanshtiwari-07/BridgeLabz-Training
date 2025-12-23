import java.util.Scanner;

public class VowelsAndConsonantsString
{   	
    public static int[] countOfVowelsAndConsonants(String text)
    {
	int vowels = 0, consonants = 0;
	int size = text.length();
	text = text.toLowerCase();
	for(int i=0; i<size; i++)
	{
	    char ch = text.charAt(i);
	    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	    {
		vowels++;
	    }
	    else if((ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' 
	    || ch != 'u') && (ch > 'a' && ch <= 'z'))
	    {
		consonants++;
	    }
	}
	return new int[]{vowels, consonants};
    }
	
    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
	String text;
	System.out.print("Enter String: ");
	text = input.nextLine();
	int size = text.length();
	
	int[] count = countOfVowelsAndConsonants(text);
	System.out.println("Vowels are: " + count[0]);
	System.out.println("Consonants are: " + count[1]);
		
    }
}