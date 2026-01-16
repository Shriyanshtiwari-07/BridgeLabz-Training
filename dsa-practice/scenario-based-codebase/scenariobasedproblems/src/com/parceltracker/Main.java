package com.parceltracker;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Tracker tracker = new Tracker();

	        tracker.insertStage("Packed");
	        tracker.insertStage("Shipped");
	        tracker.insertStage("In Transit");
	        tracker.insertStage("Delivered");

	        tracker.trackParcel();
	        System.out.println();

	        // Add custom checkpoint
	        tracker.addCustomStage("Shipped", "Customs Check");
	        tracker.trackParcel();
	        System.out.println();

	        // Check parcel status
	        tracker.checkForLoss();
	}

}