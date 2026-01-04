package com.linkedlist.doublylinkedlist.moviemanagement;

public class MovieDemo {
	public static void main(String[] args) {
   	 DoublyLinkedList list = new DoublyLinkedList();
   	 list.add("Avatar","Ravi","2003", 4.5f);
   	 list.add("Dhurandhar","Ashish","2025", 3.5f);
   	 list.display();
   	 list.updateRating("Mind Blowing", 4.5f);
   	 list.display();
   	 
    }
}