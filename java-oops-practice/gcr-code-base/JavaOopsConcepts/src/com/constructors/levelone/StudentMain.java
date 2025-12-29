package com.constructors.levelone;

public class StudentMain {
	public static void main(String[] args) {
		
		// Creating object of student
		Student s1 = new Student("0191CD221147", "Shriyansh Tiwari", 7.09f);
		Student s2 = new Student("0191CD221148", "Rohit Sharma", 7.20f);		
		Student s3 = new Student("0191CD221150", "Manya tiwari", 7.00f);		
		
		PostgraduateStudent pg = new PostgraduateStudent(
                "0191AL221200",
                "Shriyansh Tiwari",
                8.5f
        );

        pg.displayDetails();          // From parent
        pg.displayPostgraduateInfo(); // From child using protected

        pg.updateName("Shriyansh PG");
        pg.displayPostgraduateInfo(); // Updated protected value
    
		
		s1.displayDetails();
		s1.modifyCGPA(9.0f);
		
		s1.displayDetails();
	}
}