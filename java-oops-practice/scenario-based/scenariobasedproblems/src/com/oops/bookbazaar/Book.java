package com.oops.bookbazaar;

public class Book {
	public String title;
	public String author;
	public double price;
	public int stock;
	
	public Book(String title, String author, double price, int stock) {
		this.title =title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}
	
	public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void updateStock(int quantity) {
        if(quantity <= stock) {
            stock -= quantity;
        } else {
            System.out.println("Not enough stock!");
        }
    }

    @Override
    public String toString() {
        return title + " by " + author + ", Price: " + price + ", Stock: " + stock;
    }
}