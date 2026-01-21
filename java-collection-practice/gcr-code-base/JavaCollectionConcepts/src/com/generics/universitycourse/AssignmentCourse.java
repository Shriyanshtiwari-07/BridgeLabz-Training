package com.generics.universitycourse;

public class AssignmentCourse extends CourseType {

    public AssignmentCourse() {
        super("Assignments & Projects");
    }

    @Override
    public String getTypeName() {
        return "Assignment-Based Course";
    }
}