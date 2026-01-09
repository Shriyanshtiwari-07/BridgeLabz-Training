package com.oops.tourMate;

public class Main {
	 public static void main(String[] args) {

	        Transport t = new Transport(5000);
	        Hotel h = new Hotel(8000);
	        Activity a = new Activity(2000);

	        Trip trip = new InternationalTrip("Paris", 7, t, h, a);

	        trip.bookTrip();
	        System.out.println("Total Budget: " + trip.getTotalBudget());
	    }
}