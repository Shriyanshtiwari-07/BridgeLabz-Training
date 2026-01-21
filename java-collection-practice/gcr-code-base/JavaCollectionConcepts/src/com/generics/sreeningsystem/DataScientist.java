package com.generics.sreeningsystem;

public class DataScientist extends JobRole {

    public DataScientist(String candidateName) {
        super(candidateName);
    }

    @Override
    public String getRoleName() {
        return "Data Scientist";
    }
}