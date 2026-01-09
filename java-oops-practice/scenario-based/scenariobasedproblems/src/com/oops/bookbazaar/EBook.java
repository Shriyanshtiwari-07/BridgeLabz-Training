package com.oops.bookbazaar;

public class EBook extends Book implements Discountable{
	private double discountPercentage;

    public EBook(String title, String author, double price, int stock, double discountPercentage) {
        super(title, author, price, stock);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double applyDiscount() {
        return getPrice() - (getPrice() * discountPercentage / 100);
    }	
}