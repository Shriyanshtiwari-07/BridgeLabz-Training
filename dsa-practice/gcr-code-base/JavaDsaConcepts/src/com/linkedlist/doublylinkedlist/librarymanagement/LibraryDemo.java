package com.linkedlist.doublylinkedlist.librarymanagement;


public class LibraryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Library lib = new Library();

		 lib.addAtEnd(101, "Java Basics", "David John", "Programming", true);
		 lib.addAtEnd(102, "Atomic Habits", "Marcus", "Habits", true);
		 lib.addAtBeginning(103, "Business days", "Lincoln", "Business", false);

		 System.out.println("All Books (Forward):");
		 lib.displayForward();

		 System.out.println("\nAll Books (Reverse):");
		 lib.displayReverse();

		 System.out.println("\nSearch by Author:");
		 lib.searchByAuthor("Robert Martin");

		 lib.updateAvailability(103, true);
		 lib.removeById(101);

		 System.out.println("\nFinal Library:");
		 lib.displayForward();

		 System.out.println("\nTotal Books: " + lib.countBooks());
	}

}