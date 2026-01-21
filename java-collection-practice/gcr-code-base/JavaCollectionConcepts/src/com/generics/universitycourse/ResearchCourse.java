package com.generics.universitycourse;

public class ResearchCourse extends CourseType {

    public ResearchCourse() {
        super("Research & Thesis");
    }

    @Override
    public String getTypeName() {
        return "Research-Based Course";
    }
}
