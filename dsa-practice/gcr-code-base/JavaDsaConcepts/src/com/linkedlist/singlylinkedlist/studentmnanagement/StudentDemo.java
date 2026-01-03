package com.linkedlist.singlylinkedlist.studentmnanagement;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
    	list.addStudent("Ravi",22 ,101,'A');
    	list.addStudent("Ashish", 26, 302, 'C');
    	list.atPosition("Swaraj", 203, 202, 'B', 1);
    	
    	list.updateGrade(102, 'A');
    	list.displayAll();
	}

}
