package com.linkedlist.circularlinkedlist.taskscheduler;

import java.time.LocalDate;

public class TaskDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedlist list = new CircularLinkedlist();
    	Node n1 =new Node(101l,"Learn java",5,LocalDate.of(2026,8, 6));
    	Node n2 =new Node(102l,"Learn springboot",10,LocalDate.of(2026,11, 10));
    	Node n3 =new Node(103l,"Learn react",1,LocalDate.of(2026,10, 15));
        
    	list.add(n1);
    	list.add(n2);
    	list.add(n3);
    	list.display();
	}

}