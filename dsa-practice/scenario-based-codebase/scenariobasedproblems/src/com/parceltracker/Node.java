package com.parceltracker;


public class Node {
	String stageName;
	Node next;
	
	public Node(String stageName) {
		this.stageName = stageName;
		this.next = null;
	}
}