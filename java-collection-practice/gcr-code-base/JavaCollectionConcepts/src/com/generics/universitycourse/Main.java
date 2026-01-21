package com.generics.universitycourse;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Course<ExamCourse> math =
                new Course<>("MTH101", "Calculus", new ExamCourse());

        Course<AssignmentCourse> cs =
                new Course<>("CSE201", "Data Structures", new AssignmentCourse());

        Course<ResearchCourse> phd =
                new Course<>("RES501", "AI Research", new ResearchCourse());

        Department science = new Department("Science & Technology");
        science.addCourse(math);
        science.addCourse(cs);
        science.addCourse(phd);

        science.displayCourses();

        // Wildcard usage
        List<CourseType> courseTypes = Arrays.asList(
                new ExamCourse(),
                new AssignmentCourse(),
                new ResearchCourse()
        );

        System.out.println("\nAvailable Course Types:");
        CourseUtils.displayCourses(courseTypes);
    }
}