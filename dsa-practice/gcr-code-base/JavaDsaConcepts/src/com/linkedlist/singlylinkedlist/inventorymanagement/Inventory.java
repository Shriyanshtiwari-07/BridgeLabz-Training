package com.linkedlist.singlylinkedlist.inventorymanagement;


public class Inventory {
	 private Node head;

	    // insert at beginning
	    public void addAtBeginning(int id, String name, int qty, double price) {
	    	Node newNode = new Node(id, name, qty, price);
	        newNode.next = head;
	        head = newNode;
	    }

	    // insert at end
	    public void addAtEnd(int id, String name, int qty, double price) {
	        Node newNode = new Node(id, name, qty, price);

	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	    }

	   // insert at position
	    public void addAtPosition(int pos, int id, String name, int qty, double price) {
	        if (pos == 0) {
	            addAtBeginning(id, name, qty, price);
	            return;
	        }

	        Node temp = head;
	        for (int i = 0; i < pos - 1 && temp != null; i++) {
	            temp = temp.next;
	        }

	        if (temp == null) {
	            System.out.println("Invalid Position");
	            return;
	        }

	        Node newNode = new Node(id, name, qty, price);
	        newNode.next = temp.next;
	        temp.next = newNode;
	    }

	    // remove by id
	    public void removeById(int id) {
	        if (head == null) return;

	        if (head.itemId == id) {
	            head = head.next;
	            return;
	        }

	        Node prev = head;
	        Node curr = head.next;

	        while (curr != null) {
	            if (curr.itemId == id) {
	                prev.next = curr.next;
	                return;
	            }
	            prev = curr;
	            curr = curr.next;
	        }

	        System.out.println("Item not found");
	    }

	   // update 
	    public void updateQuantity(int id, int newQty) {
	    	Node temp = head;

	        while (temp != null) {
	            if (temp.itemId == id) {
	                temp.quantity = newQty;
	                return;
	            }
	            temp = temp.next;
	        }

	        System.out.println("Item not found");
	    }

	  // search by id
	    public void searchById(int id) {
	    	Node temp = head;

	        while (temp != null) {
	            if (temp.itemId == id) {
	                displayItem(temp);
	                return;
	            }
	            temp = temp.next;
	        }

	        System.out.println("Item not found");
	    }

	    // search by name
	    public void searchByName(String name) {
	    	Node temp = head;
	        boolean found = false;

	        while (temp != null) {
	            if (temp.itemName.equalsIgnoreCase(name)) {
	                displayItem(temp);
	                found = true;
	            }
	            temp = temp.next;
	        }

	        if (!found)
	            System.out.println("Item not found");
	    }

	 
	    public double totalInventoryValue() {
	        double total = 0;
	        Node temp = head;

	        while (temp != null) {
	            total += temp.price * temp.quantity;
	            temp = temp.next;
	        }
	        return total;
	    }

	   // sorting by name
	    public void sortByName(boolean ascending) {
	        for (Node i = head; i != null; i = i.next) {
	            for (Node j = i.next; j != null; j = j.next) {
	                if ((ascending && i.itemName.compareToIgnoreCase(j.itemName) > 0) ||
	                    (!ascending && i.itemName.compareToIgnoreCase(j.itemName) < 0)) {
	                    swapData(i, j);
	                }
	            }
	        }
	    }

	    
	    public void sortByPrice(boolean ascending) {
	        for (Node i = head; i != null; i = i.next) {
	            for (Node j = i.next; j != null; j = j.next) {
	                if ((ascending && i.price > j.price) ||
	                    (!ascending && i.price < j.price)) {
	                    swapData(i, j);
	                }
	            }
	        }
	    }

	   // swap nodes
	    private void swapData(Node a, Node b) {
	        int id = a.itemId;
	        String name = a.itemName;
	        int qty = a.quantity;
	        double price = a.price;

	        a.itemId = b.itemId;
	        a.itemName = b.itemName;
	        a.quantity = b.quantity;
	        a.price = b.price;

	        b.itemId = id;
	        b.itemName = name;
	        b.quantity = qty;
	        b.price = price;
	    }

	    // display
	    public void displayInventory() {
	    	Node temp = head;
	        while (temp != null) {
	            displayItem(temp);
	            temp = temp.next;
	        }
	    }

	    private void displayItem(Node item) {
	        System.out.println(
	            "ID: " + item.itemId +
	            ", Name: " + item.itemName +
	            ", Qty: " + item.quantity +
	            ", Price: " + item.price
	        );
	    }
}