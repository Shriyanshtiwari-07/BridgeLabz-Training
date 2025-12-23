import java.util.Scanner;

public class CheckAnagram
{
    public static boolean isAnagram(String text1, String text2)
    {
        
        if (text1.length() != text2.length())
            return false;

        int[] freq = new int[256];

        
        for (int i = 0; i < text1.length(); i++)
        {
            char ch = text1.charAt(i);
            freq[ch]++;
        }

        
        for (int i = 0; i < text2.length(); i++)
        {
            char ch = text2.charAt(i);
            freq[ch]--;
        }

        for (int i = 0; i < 256; i++)
        {
            if (freq[i] != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = input.nextLine();

        System.out.print("Enter second text: ");
        String text2 = input.nextLine();

        if (isAnagram(text1, text2))
            System.out.println("Texts are Anagrams");
        else
            System.out.println("Texts are NOT Anagrams");
    }
}