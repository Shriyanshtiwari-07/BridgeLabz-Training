package com.oops.eventease;

public class BirthdayEvent extends Event {
	private double venueCost;
    private double serviceCost;
    private double discount = 500;

    public BirthdayEvent(String location, String date, int attendees, double venueCost, double serviceCost, User organizer) {
        super("Birthday Party", location, date, attendees);
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.organizer = organizer;
    }

    @Override
    public void schedule() {
        System.out.println("Birthday event scheduled with decorations......");
    }

    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }
}
