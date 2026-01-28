package com.Reflection.dynamicobjects;
public class Student {
    private String name = "Unknown";

    public Student() {}

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
