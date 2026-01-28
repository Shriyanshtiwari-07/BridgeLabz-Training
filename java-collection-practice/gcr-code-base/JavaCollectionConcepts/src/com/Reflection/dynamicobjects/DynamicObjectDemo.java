package com.Reflection.dynamicobjects;
public class DynamicObjectDemo {

    public static void main(String[] args) throws Exception {
        Class<Student> clazz = Student.class;
        Student student = clazz.getDeclaredConstructor().newInstance();
        System.out.println("Student name: " + student.getName());
    }
}
