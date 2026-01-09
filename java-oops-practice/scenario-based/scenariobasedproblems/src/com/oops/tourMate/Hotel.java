package com.oops.tourMate;

public class Hotel implements IBookable {
    private double cost;

    public Hotel(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public void book() {
        System.out.println("Hotel booked");
    }

    @Override
    public void cancel() {
        System.out.println("Hotel cancelled");
    }
}