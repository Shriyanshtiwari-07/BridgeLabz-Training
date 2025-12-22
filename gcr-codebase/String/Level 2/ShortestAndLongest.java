import java.util.Scanner;

public class ShortestAndLongest
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
	if(!temp.equals(""))
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
	if(!temp.equals(""))
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
	
    public static String[] findShortestAndLongest(String[][] wordTwoDArray, int size)
    {
        String shortest = wordTwoDArray[0][0];
        String largest = wordTwoDArray[0][0];

        int minLen = Integer.parseInt(wordTwoDArray[0][1]);
        int maxLen = minLen;

        for(int i = 1; i < size; i++)
        {
            int currLen = Integer.parseInt(wordTwoDArray[i][1]);

            if(currLen < minLen)
            {
                minLen = currLen;
                shortest = wordTwoDArray[i][0];
            }

            if(currLen > maxLen)
            {
                maxLen = currLen;
                largest = wordTwoDArray[i][0];
            }
        }
        return new String[]{shortest, largest};
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
	String[] result = findShortestAndLongest(wordTwoDArray, wordTwoDArray.length);
		
	System.out.println("Shortest String is: " + result[0]);
	System.out.println("Largest String is: " + result[1]);
	
	for(int i=0; i<words.length; i++)
	{	
	    System.out.println(wordTwoDArray[i][0] + " - " + wordTwoDArray[i][1]);
	}

		
    }
}