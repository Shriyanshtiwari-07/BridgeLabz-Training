package com.generics.sreeningsystem;

import java.util.List;

public class ResumeScreeningUtils {

    // Wildcard method to process any type of job role
    public static void screenResumes(List<? extends JobRole> candidates) {
        for (JobRole candidate : candidates) {
            System.out.println("Screening resume for: " + candidate);
        }
    }

    // Generic method to score a resume dynamically
    public static <T extends JobRole> void scoreResume(Resume<T> resume) {
        // For simplicity, generate a dummy score
        double score = Math.random() * 100;
        System.out.println("Candidate: " + resume.getCandidate().getCandidateName()
                + " | Role: " + resume.getCandidate().getRoleName()
                + " | Score: " + String.format("%.2f", score));
    }
}