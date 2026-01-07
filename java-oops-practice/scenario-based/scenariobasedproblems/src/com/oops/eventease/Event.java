package com.oops.eventease;

public class Event implements ISchedulable{
	 private static int counter = 1000; // auto increment
	 private final int eventId;          // cannot be changed

	 protected String eventName;
	 protected String location;
	 protected String date;
	 protected int attendees;
	    
	 protected User organizer;

	 public Event(String eventName, String location, String date, int attendees) {
		 this.eventId = counter++;  // assigned once
		 this.eventName = eventName;
		 this.location = location;
		 this.date = date;
		 this.attendees = attendees;
	 }

	 public int getEventId() {
		 return eventId;
	 }

	 @Override
	 public void schedule() {
		 System.out.println("Event " + eventId + " scheduled");
	 }

	 @Override
	 public void reschedule(String newDate) {
		 this.date = newDate;
	 }

	 @Override
	 public void cancel() {
		 System.out.println("Event " + eventId + " cancelled");
	 }
	    
	 public void showEventDetails() {
		 System.out.println("Event ID: " + eventId);
		 System.out.println("Event Name: " + eventName);
		 System.out.println("Location: " + location);
		 System.out.println("Date: " + date);
		 System.out.println("Attendees: " + attendees);
		 System.out.println("Organizer: " + organizer.getName());
	 }
}