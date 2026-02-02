package com.collectors.studentresultgrouping;

import java.util.*;
import java.util.stream.Collectors;

public class StudentResultGrouping {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Nageshwar", "A"),
                new Student("Lucky", "B"),
                new Student("Himesh", "A"),
                new Student("Ravi", "C"),
                new Student("Sneha", "B")
        );

        Map<String, List<String>> studentsByGrade =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getGrade,
                                Collectors.mapping(Student::getName, Collectors.toList())
                        ));

        studentsByGrade.forEach((grade, names) ->
                System.out.println(grade + " -> " + names));
    }
}
