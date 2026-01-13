package com.oops.skillforge;


public class Main{

    public static void main(String[] args) {

        Instructor instructor = new Instructor("Alice", "alice@skillforge.com");
        Student student = new Student("Bob", "bob@gmail.com");

        Course javaCourse = new BeginnerCourse("Java Basics", instructor);
        Course aiCourse = new AdvancedCourse(
                "AI Mastery",
                instructor,
                new String[]{"ML", "DL", "Projects"}
        );

        student.updateProgress(3, 3);
        student.assignGrade(80, 100);

        System.out.println(CertificateGenerator.generate(student, javaCourse));
        System.out.println(CertificateGenerator.generate(student, aiCourse));
    }
}