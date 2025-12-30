//Train Reservation Queue 🚆
//Simulate a basic ticket booking system.
// Show menu with switch
// Allow multiple bookings using while-loop.
// Stop booking once seats reach zero (break).

import java.util.Scanner;

public class TrainReservation
{
    public static void trainReservationQueue()
    {
	Scanner input = new Scanner(System.in);
	String[] seats = new String[10];
	int[] age = new int[10];
	int[] date = new int[10];
	int atIdx = 0;

	while(true)
	{
	    if(seats.length == atIdx)
	    {
		System.out.println("Seats Full-----------");
		break;
	    }
		
	    int userChoice;
	    System.out.println("1 -> Book Tickets");
	    System.out.println("2 -> Check Available Seats");
	    System.out.println("3 -> Exit");
	    userChoice = input.nextInt();
	    while(userChoice != 1 && userChoice != 2 && userChoice != 3)
	    {
		System.out.println("1 Invalid Choice ---------- Enter Again----");
		System.out.println("1 -> Book Tickets");
	        System.out.println("2 -> Check Available Seats");
	    	System.out.println("3 -> Exit");
	    	userChoice = input.nextInt();
	    }
	     	
	    if(userChoice == 3)
	    {
		System.out.println("Thank You For Visiting-------");
		break;
	    }   

	    switch(userChoice)
	    {
  		case 1:
		{
		    System.out.print("Enter Name: ");
		    seats[atIdx] = input.next();
		    System.out.print("Enter age: ");
		    age[atIdx] = input.nextInt();
		    System.out.print("Enter Date of Travelling: ");
		    date[atIdx] = input.nextInt();
	
		    System.out.println("-------------------- Booking Successfull --------------");
		    System.out.println("--------------------                    ---------------");
		    System.out.println("-------------------- Booking Details    ---------------");
	    	    System.out.println("Booking Name : " + seats[atIdx]);
		    System.out.println("Age : " + age[atIdx]);
		    System.out.println("Booking Date : " + date[atIdx]);
		    System.out.println("-------------------- Thank You For Booking-------------");
		    atIdx++;
		    break;
		}
		case 2:
		{
		    System.out.println("Available Seats: " + (seats.length - atIdx));
		    break;
		}
	    }
	}
    }

    public static void main(String args[])
    {
	trainReservationQueue();
    }
}