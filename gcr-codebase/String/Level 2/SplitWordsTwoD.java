import java.util.Scanner;

public class SplitWordsTwoD
{
    public static int returnWordCount(String text)
    {
	int noOfWords = 0;
	int size = text.length();
	int wordCount = 0;	

	String temp = "";
	for(int i=0; i<size; i++)
	{
	    char ch = text.charAt(i);
	    if(ch == ' ')
	    {
		wordCount++;
		temp = "";
	    }
	    else
		temp += ch;
	}	
	if(temp != "")
	    wordCount++;
	return wordCount;
    }
	
    public static String[] splitTextIntoWords(String text, int wordCount)   
    {	
	String[] words = new String[wordCount];
	String temp = "";
	int index = 0;
	int size = text.length();
	for(int i=0; i<size; i++)
	{
	    char ch = text.charAt(i);
	    if(ch == ' ')
	    {
		words[index++] = temp;
		temp = "";
	    }
	    else
		temp += ch;
	}
	if(temp != "")
	    words[index++] = temp;
	return words;
    } 

    public static String[][] createTwoDWordArray(String[] words)
    {
	int size = words.length;
	String[][] wordTwoDArray = new String[size][2];
	for(int i=0; i<size; i++)
	{
	    int len = 0;
	    for(int j=0; j<words[i].length(); j++)
	    {
		len++;
	    }
	    wordTwoDArray[i][0] = words[i];
	    wordTwoDArray[i][1] = String.valueOf(len);
	}
	return wordTwoDArray;
    }    
	
    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
	String text;
	System.out.print("Enter Text: ");
	text = input.nextLine();
	int size = text.length();
	
	int wordCount = returnWordCount(text);
	String[] words = splitTextIntoWords(text, wordCount);
	String[][] wordTwoDArray = createTwoDWordArray(words);
	
	for(int i=0; i<words.length; i++)
	{	
	    System.out.println(wordTwoDArray[i][0] + " - " + wordTwoDArray[i][1]);
	}
		
    }
}