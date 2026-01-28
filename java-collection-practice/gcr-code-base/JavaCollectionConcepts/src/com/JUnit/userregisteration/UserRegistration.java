package com.JUnit.userregisteration;
public class UserRegistration {

    public void registerUser(String username, String email, String password) {
        if(username == null || username.isEmpty()) throw new IllegalArgumentException("Invalid username");
        if(!email.contains("@")) throw new IllegalArgumentException("Invalid email");
        if(password.length() < 6) throw new IllegalArgumentException("Invalid password");
    }
}
