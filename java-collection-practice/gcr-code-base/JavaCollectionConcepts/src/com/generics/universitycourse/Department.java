package com.generics.universitycourse;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String departmentName;
    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void displayCourses() {
        System.out.println("Department: " + departmentName);
        for (Course<? extends CourseType> course : courses) {
            System.out.println(course);
        }
    }
}