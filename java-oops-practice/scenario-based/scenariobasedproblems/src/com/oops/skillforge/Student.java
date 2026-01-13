package com.oops.skillforge;


public class Student extends User implements ICertifiable {

    private int progress;   // percentage
    private int grade;

    public Student(String name, String email) {
        super(name, email);
        this.progress = 0;
        this.grade = 0;
    }

    // Operator usage: progress tracking
    public void updateProgress(int completedModules, int totalModules) {
        this.progress = (completedModules * 100) / totalModules;
    }

    // Operator usage: grading
    public void assignGrade(int marksObtained, int totalMarks) {
        this.grade = (marksObtained * 100) / totalMarks;
    }

    @Override
    public String generateCertificate() {
        if (progress == 100 && grade >= 50) {
            return "Certificate of Completion awarded to " + name;
        }
        return "Course not yet completed.";
    }
}
