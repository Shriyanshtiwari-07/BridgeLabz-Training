package com.oops.eventease;


public class EventEaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User("Swaraj", "swaraj@gmail.com");

		BirthdayEvent birthday = new BirthdayEvent("Bhopal", "10-02-2026", 50, 15000, 5000, user);

		ConferenceEvent conference = new ConferenceEvent("Indore", "20-03-2026", 200, 50000, 20000, user);
		
		birthday.schedule();
		birthday.showEventDetails();
		System.out.println("Total Cost: " + birthday.calculateTotalCost());
		System.out.println();

		conference.schedule();
		conference.reschedule("25-03-2026");
		conference.showEventDetails();
		System.out.println("Total Cost: " + conference.calculateTotalCost());
	    
	}

}