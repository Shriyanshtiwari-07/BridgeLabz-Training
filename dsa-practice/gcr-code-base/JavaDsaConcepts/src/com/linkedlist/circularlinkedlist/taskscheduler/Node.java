package com.linkedlist.circularlinkedlist.taskscheduler;

import java.time.LocalDate;

public class Node {
	  long id;
	  String name;
	  int priority;
	  LocalDate due;
	  Node next;
	  public Node(long id, String name, int priority, LocalDate due) {
		  super();
		  this.id = id;
		  this.name = name;
		  this.priority = priority;
		  this.due = due;
	  }
}