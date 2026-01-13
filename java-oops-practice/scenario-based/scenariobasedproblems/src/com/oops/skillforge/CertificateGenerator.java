package com.oops.skillforge;


public class CertificateGenerator {

    public static String generate(Student student, Course course) {

        if (course instanceof AdvancedCourse) {
            return "Advanced Skill Certificate awarded to " + student.generateCertificate();
        } else {
            return "Beginner Skill Certificate awarded to " + student.generateCertificate();
        }
    }
}
