import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame
{
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static int generateGuess(int low, int high)
    {
        return random.nextInt(high - low + 1) + low;
    }

    public static String getFeedback()
    {
        System.out.print("Is the guess high, low, or correct? ");
        return input.next().toLowerCase();
    }

    public static int[] updateRange(String feedback, int guess, int low, int high)
    {
        if(feedback.equals("high"))
        {
            high = guess - 1;
        }
        else if(feedback.equals("low"))
        {
            low = guess + 1;
        }
        return new int[]{low, high};
    }

    public static void main(String args[])
    {
        int low = 1;
        int high = 100;
        int guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100");
        System.out.println("I will try to guess it");

        while (true)
        {
            guess = generateGuess(low, high);
            System.out.println("My guess: " + guess);

            feedback = getFeedback();
            if (feedback.equals("correct"))
            {
                System.out.println("I guessed your number correctly!");
                break;
            }
            int[] range = updateRange(feedback, guess, low, high);
            low = range[0];
            high = range[1];
        }
    }
}