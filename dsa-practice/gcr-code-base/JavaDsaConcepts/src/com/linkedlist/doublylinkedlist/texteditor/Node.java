package com.linkedlist.doublylinkedlist.texteditor;


public class Node {
	 String content;
	 Node prev;
	 Node next;

	 Node(String content) {
		 this.content = content;
		 this.prev = null;
		 this.next = null;
	 }
}