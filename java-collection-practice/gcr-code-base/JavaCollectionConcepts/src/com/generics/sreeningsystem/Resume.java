package com.generics.sreeningsystem;

public class Resume<T extends JobRole> {

    private T candidate;

    public Resume(T candidate) {
        this.candidate = candidate;
    }

    public T getCandidate() {
        return candidate;
    }

    public void displayResume() {
        System.out.println("Processing Resume: " + candidate);
    }
}
