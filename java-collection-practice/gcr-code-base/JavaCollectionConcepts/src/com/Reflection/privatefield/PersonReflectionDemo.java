package com.Reflection.privatefield;
import java.lang.reflect.Field;

public class PersonReflectionDemo {

    public static void main(String[] args) throws Exception {
        Person person = new Person();

        Field ageField = Person.class.getDeclaredField("age");
        ageField.setAccessible(true);

        System.out.println("Original age: " + ageField.get(person));
        ageField.set(person, 30);
        System.out.println("Modified age: " + ageField.get(person));
    }
}
