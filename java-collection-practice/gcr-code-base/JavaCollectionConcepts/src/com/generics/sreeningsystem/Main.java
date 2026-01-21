package com.generics.sreeningsystem;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create candidates
        Resume<SoftwareEngineer> seResume =
                new Resume<>(new SoftwareEngineer("Alice"));

        Resume<DataScientist> dsResume =
                new Resume<>(new DataScientist("Bob"));

        Resume<ProductManager> pmResume =
                new Resume<>(new ProductManager("Charlie"));

        // Display individual resumes
        seResume.displayResume();
        dsResume.displayResume();
        pmResume.displayResume();

        System.out.println("\nScoring Resumes:");
        ResumeScreeningUtils.scoreResume(seResume);
        ResumeScreeningUtils.scoreResume(dsResume);
        ResumeScreeningUtils.scoreResume(pmResume);

        System.out.println("\nScreening Multiple Resumes:");
        List<JobRole> allCandidates = Arrays.asList(
                seResume.getCandidate(),
                dsResume.getCandidate(),
                pmResume.getCandidate()
        );
        ResumeScreeningUtils.screenResumes(allCandidates);
    }
}