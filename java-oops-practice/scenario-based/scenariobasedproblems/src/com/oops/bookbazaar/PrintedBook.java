package com.oops.bookbazaar;

public class PrintedBook extends Book implements Discountable{
	private double shippingCharge;

    public PrintedBook(String title, String author, double price, int stock, double shippingCharge) {
        super(title, author, price, stock);
        this.shippingCharge = shippingCharge;
    }

    @Override
    public double applyDiscount() {
        // For example, fixed 10% discount
        return (getPrice() - getPrice() * 0.10) + shippingCharge;
    }
}