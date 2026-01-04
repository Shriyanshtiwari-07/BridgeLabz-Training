package com.linkedlist.circularlinkedlist.ticketreservation;

import java.time.LocalDate;

public class TicketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booking book = new Booking();
		Node t1 = new Node(101l,"Ravi","Lucky the racer",001,LocalDate.now());
		Node t2 = new Node(102l,"Ashish","DJ",002,LocalDate.now());
		Node t3 = new Node(103l,"Swaraj","Bahubali",003,LocalDate.now());
		book.add(t1);
		book.add(t2);
		book.add(t3);
		book.currentTicket();
		book.search("DJ");
		book.totalAmount();
		book.delete(103l);
		book.currentTicket();
		book.totalAmount();
	}

}