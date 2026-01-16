package com.parceltracker;


public class Tracker {
	Node head;
	Node current;
	
	public void insertStage(String stageName) {
		Node newNode = new Node(stageName);
		if(head == null) {
			head = newNode;
			current = newNode;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = newNode;
	}
	
	public void trackParcel() {
		if(head == null) {
			System.out.println("Nothing here.....");
			return ;
		}
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.stageName);
			if(temp.next != null)
				System.out.print(" -> ");
			temp = temp.next;
		}
	}
	
	public void addCustomStage(String afterStage, String newStage) {
		Node temp = head;
		
		while(!temp.stageName.equals(afterStage) && temp != null) {
			temp = temp.next;
		}
		
		if(temp == null) {
			System.out.println("After Stage Not Found.....");
		}
		
		Node newNode = new Node(newStage);
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	public void checkForLoss() {
		 Node temp = head;

	        while (temp != null) {
	            if (temp.next == null && !temp.stageName.equals("Delivered")) {
	                System.out.println("Parcel lost.. " + temp.stageName);
	                return;
	            }
	            temp = temp.next;
	        }

	        System.out.println("Parcel delivered successfully...");
	    }
}