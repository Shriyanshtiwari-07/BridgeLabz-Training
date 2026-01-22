package com.generics.sreeningsystem;

public abstract class JobRole {

    private String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public abstract String getRoleName();

    @Override
    public String toString() {
        return candidateName + " applied for " + getRoleName();
    }
}