// Festival Lucky Draw 🎉
// At Diwali mela, each visitor draws a number.
// If the number is divisible by 3 and 5, they win a gift.
// Use if, modulus, and loop for multiple visitors.
// continue if input is invalid.

import java.util.Scanner;

public class FestivalLuckyDraw
{
    public static void drawNumber()
    {
	Scanner input = new Scanner(System.in);
	System.out.println("----------- Welcome to Festival Lucky Draw ------------------------");
	while(true)
	{
	    System.out.println("---------------------------------------------------------------");
	    int random = (int)(Math.random() * 100);
	    System.out.println("Do you want to Draw a Number ? (y / n)");
	    String choice;
	    choice = input.next();
	    if(choice.equals("y"))
	    {
		System.out.println("Your Number: " + random);
		if((random % 3 == 0) || (random % 5 == 0))
	   	{
		    System.out.println("Congratulations, You Won a Gift.............");
		}
		else
		{
		    System.out.println("OOPS, You Didn't Won, Better Luck Next Time..");
		}
	    }
	    else
	    {
		System.out.println("You Won't won any Gift, Because You Wont Draw a number");
	    }

	    System.out.println("Do you want to Continue? (y / n)");
	    choice = input.next();
	    if(choice.equals("n"))
		break;
	}
    }

    public static void main(String args[])
    {
	drawNumber();
    }
}
