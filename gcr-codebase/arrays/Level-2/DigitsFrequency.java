import java.util.Scanner;

public class DigitsFrequency
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number;
        int count = 0;
        while (number > 0)
        {
            count++;
            number /= 10;
        }

        int[] digits = new int[count];
        number = originalNumber;

        for (int strt = count - 1; strt >= 0; strt--)
        {
            digits[strt] = number % 10;
            number = number / 10;
        }

        int[] freq = new int[10];
        for (int strt = 0; strt < digits.length; strt++)
        {
            freq[digits[strt]]++;
        }

        System.out.println("Digit Frequency:");
        for (int strt = 0; strt < freq.length; strt++)
        {
            if (freq[strt] > 0)
            {
                System.out.println("Digit " + strt + " comes " + freq[strt] + " times");
            }
        }
    }
}