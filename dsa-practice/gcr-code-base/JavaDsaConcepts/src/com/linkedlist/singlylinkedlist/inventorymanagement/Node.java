package com.linkedlist.singlylinkedlist.inventorymanagement;

public class Node {
	 int itemId;
	 String itemName;
	 int quantity;
	 double price;
	 Node next;

	 Node(int itemId, String itemName, int quantity, double price) {
		 this.itemId = itemId;
		 this.itemName = itemName;
		 this.quantity = quantity;
		 this.price = price;
		 this.next = null;
	 }
}