// Bus Route Distance Tracker 🚌
// Each stop adds distance.
// Ask if the passenger wants to get off at a stop.
// Use a while-loop with a total distance tracker.
// Exit on user confirmation.

import java.util.Scanner;

public class BusRouteDistance
{
    public static void trackDistance()
    {
	Scanner input = new Scanner(System.in);
	System.out.println("-----------Bus Route Distance Tracker------------");
	long totalDistance = 0;
	do
	{
	    System.out.print("Do you to get off in this stop (y / n): ");
	    String choice;
	    choice = input.next();
	    Boolean isOut = false;
	    if(choice.equals("y"))
	    {
		System.out.println("Your Total Travelled Distance in (km): " + totalDistance);
	   	System.out.println("---------------------------------------------------------");
		System.out.println("Would you like to continue (y / n): ");
		String choice2;
	    	choice2 = input.next();
		if(choice2.equals("n"))
		    isOut = true;
	    }	
	    if(isOut)
		break;
	    else
	    {
		long distance;
		System.out.println("Enter Next Stop Distance: ");
		distance = input.nextLong();
		totalDistance += distance;
	    }
	 
	}while(true);
    }

    public static void main(String args[])
    {
	trackDistance();
    }
}