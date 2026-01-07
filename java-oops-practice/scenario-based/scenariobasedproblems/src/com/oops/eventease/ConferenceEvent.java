package com.oops.eventease;


public class ConferenceEvent extends Event {
	private double venueCost;
    private double serviceCost;
    private double discount = 1000;

    public ConferenceEvent(String location, String date, int attendees, double venueCost, double serviceCost, User organizer) {
        super("Conference", location, date, attendees);
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.organizer = organizer;
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled with setup.......");
    }

    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }
}
