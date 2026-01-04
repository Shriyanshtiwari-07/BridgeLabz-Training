package com.linkedlist.circularlinkedlist.ticketreservation;

import java.time.LocalDate;

public class Node {
	 Node perv;
     long ticketId;
     String customerName;
     String movieName;
     int seatNo;
     LocalDate time;
     Node next;
	  
     
     public Node(long ticketId, String customerName, String movieName, int seatNo, LocalDate time) {
		this.ticketId = ticketId;
		this.customerName = customerName;
		this.movieName = movieName;
		this.seatNo = seatNo;
		this.time = time;
		this.perv = null;
		this.next = null;
	   }
}