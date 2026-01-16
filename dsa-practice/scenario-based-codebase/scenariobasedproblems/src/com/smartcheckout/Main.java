package com.smartcheckout;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item rice = new Item("Rice", 110);
		Item soap = new Item("Soap", 40);
		Item detergent = new Item("Detergent", 90);
		Item maggi = new Item("Maggie", 65);
		
		
		Customer ravi = new Customer("101", "Ravi");
		ravi.addItem(maggi);
		ravi.addItem(detergent);
		ravi.checkItemPrice(maggi);
		
		Customer ashish = new Customer("202", "Ashish");
		ashish.addItem(soap);
		ashish.addItem(rice);
		
		Checkout c1 = new Checkout();
		c1.calculateTotalAmount();
		c1.addCustomers(ravi);
		c1.addCustomers(ashish);
		c1.calculateTotalAmount();
		
	}

}