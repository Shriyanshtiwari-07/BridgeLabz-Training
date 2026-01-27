package com.Annotations.maxlength;
import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    public String username;

    public User(String username) throws Exception {
        Field field = this.getClass().getField("username");
        MaxLength maxLength = field.getAnnotation(MaxLength.class);
        if (username.length() > maxLength.value()) {
            throw new IllegalArgumentException("Username exceeds max length");
        }
        this.username = username;
    }

    public static void main(String[] args) throws Exception {
        User u1 = new User("Alice"); // OK
        System.out.println(u1.username);

        try {
            User u2 = new User("VeryLongUsername"); // throws exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
