package com.oops.gamebox;

public class Game implements IDownloadable {
    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    // Constructor for paid game
    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // Constructor for free game
    public Game(String title, String genre) {
        this(title, genre, 0.0, 0.0);
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    // Apply seasonal discount (operator-like behavior)
    public Game applyDiscount(double percentage) {
        double discountedPrice = price - (price * percentage / 100);
        return new Game(title, genre, discountedPrice, rating);
    }

    @Override
    public void download() {
        System.out.println(title + " is downloading...");
    }

    @Override
    public void playDemo() {
        System.out.println("Playing demo of the game...");
    }
}
