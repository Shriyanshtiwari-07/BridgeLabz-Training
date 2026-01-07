package com.oops.universityenrollmentsystem;

public class Faculty {
	private String name;

    public Faculty(String name) { 
    	this.name = name; 
    }

    public void gradeStudent(Grade enrollment, double score) {
        
        enrollment.assignGrade(score);
    }
}