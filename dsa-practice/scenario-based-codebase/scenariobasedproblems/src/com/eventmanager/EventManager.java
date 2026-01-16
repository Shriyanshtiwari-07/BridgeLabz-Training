package com.eventmanager;

public class EventManager {

    public static void main(String[] args) {
        double[] ticketPrices = {
            2500, 1200, 4500, 800, 1500, 3000, 600, 2000
        };

        // Sort ticket prices
        Ticket.quickSort(ticketPrices);

        // Display top 5 cheapest tickets
        System.out.println("Top 5 Cheapest Tickets:");
        for (int i = 0; i < 5; i++) {
            System.out.println(ticketPrices[i]);
        }

        // Display top 5 most expensive tickets
        System.out.println("\nTop 5 Most Expensive Tickets:");
        for (int i = ticketPrices.length - 1; i >= ticketPrices.length - 5; i--) {
            System.out.println(ticketPrices[i]);
        }
    }
}