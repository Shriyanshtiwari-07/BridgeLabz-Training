package com.generics.universitycourse;

public class ExamCourse extends CourseType {

    public ExamCourse() {
        super("Written Exam");
    }

    @Override
    public String getTypeName() {
        return "Exam-Based Course";
    }
}