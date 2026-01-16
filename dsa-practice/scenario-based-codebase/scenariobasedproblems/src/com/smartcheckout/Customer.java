package com.smartcheckout;

import java.util.*;

public class Customer {
	
	String custId;
	String custName;
	List<Item> items;
	HashMap<String, Double> itemPrice;
	
	public Customer(String custId, String custName) {
		this.custId = custId;
		this.custName = custName;
		items = new ArrayList<>();
		itemPrice = new HashMap<>();
	}
	
	public void addItem(Item item) {
		items.add(item);
		itemPrice.put(item.itemName, item.getPrice());
		item.setStock();
	}
	
	public void removeItem(String itemname) {
		if(items.isEmpty()) {
			System.out.println("Nothing to remove.....");
			return;
		}
		
		for(Item item: items) {
			if(item.itemName.equals(itemname)) {
				items.remove(item);
				break;
			}
		}
	}
	
	public void checkItemPrice(Item item) {
		if(itemPrice.containsKey(item.itemName)) {
			double price = itemPrice.get(item.itemName);
			System.out.println("Item Name: " + item.itemName + ", Price: " + price);
			return;
		}
		System.out.println("Item Not present....");
	}
	
	public void totalBill() {
		if(items.isEmpty()) {
			System.out.println("Nothing to calculate...");
			return;
		}
		
		double totalAmount = 0;
		System.out.println("-------------------------------------------------------------");
		System.out.println("Customer ID: " + custId);
		System.out.println("Customer Name: " + custName);
		for(Item item: items) {
			System.out.println("Item Name: " + item.itemName);
			totalAmount += item.getPrice();
		}
		System.out.println("Total Amount: " + totalAmount);
	}
}