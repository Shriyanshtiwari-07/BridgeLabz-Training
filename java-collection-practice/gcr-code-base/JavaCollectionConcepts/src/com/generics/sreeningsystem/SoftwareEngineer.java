package com.generics.sreeningsystem;

public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer(String candidateName) {
        super(candidateName);
    }

    @Override
    public String getRoleName() {
        return "Software Engineer";
    }
}