package com.oops.campusconnect;
import java.util.*;

public class Student extends Person implements CourseActions{
	
	private ArrayList<Integer> grades;
	private ArrayList<Course> courses;
	
	public Student(String name, String email, String id) {
		super(name, email, id);
		grades = new ArrayList<>();
		courses = new ArrayList<>();
	}
	
	public void addGrade(int grade) {
		grades.add(grade);
	}
	
	public double calculateGPA() {
		if(grades.isEmpty()) return 0.0;
		
		int sum =0;
		for(int i:grades)
			sum+=i;
		
		return (double) sum/grades.size();
	}
	
	@Override
	public void enrollCourse(Course course) {
		courses.add(course);
		course.addStudent(this);
	}
	
	@Override
	public void dropCourse(Course course) {
		courses.remove(course);
		course.removeStudent(this);
	}
	
	@Override
	public void printDetails() {
		System.out.println("Status: Student");
        super.printDetails();
        System.out.println("GPA: " + calculateGPA());
	}
	
	
}