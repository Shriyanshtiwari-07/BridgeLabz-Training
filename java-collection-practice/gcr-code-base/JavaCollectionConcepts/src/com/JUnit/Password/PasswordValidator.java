package com.JUnit.Password;
public class PasswordValidator {

    public boolean isValid(String password) {
        if(password.length() < 8) return false;
        if(!password.matches(".*[A-Z].*")) return false;
        if(!password.matches(".*\\d.*")) return false;
        return true;
    }
}
