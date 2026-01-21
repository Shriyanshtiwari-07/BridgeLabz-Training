package com.generics.universitycourse;

public class Course<T extends CourseType> {

    private String courseCode;
    private String courseName;
    private T courseType;

    public Course(String courseCode, String courseName, T courseType) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return courseCode + " - " + courseName + " [" + courseType + "]";
    }
}