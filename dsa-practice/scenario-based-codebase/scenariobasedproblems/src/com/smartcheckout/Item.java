package com.smartcheckout;

public class Item {
	
	public String itemName;
	private double price;
	private int stock;
	
	public Item(String itemName, double price) {
		this.itemName = itemName;
		this.price = price;
	}
	
	public void setStock() {
		stock--;
	}
	
	public double getPrice() {
		return price;
	}
}