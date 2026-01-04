package com.linkedlist.doublylinkedlist.librarymanagement;


public class Node {
	 int bookId;
	 String title;
	 String author;
	 String genre;
	 boolean isAvailable;

	 Node next;
	 Node prev;

	 Node(int bookId, String title, String author, String genre, boolean isAvailable) {
		 this.bookId = bookId;
		 this.title = title;
		 this.author = author;
		 this.genre = genre;
		 this.isAvailable = isAvailable;
		 this.next = null;
		 this.prev = null;
	 }
}