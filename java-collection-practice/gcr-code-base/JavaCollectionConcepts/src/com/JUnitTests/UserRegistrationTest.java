package com.JUnitTests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.JUnit.userregisteration.UserRegistration;

public class UserRegistrationTest {

    @Test
    public void testValidRegistration() {
        UserRegistration ur = new UserRegistration();
        assertDoesNotThrow(() -> ur.registerUser("john", "john@example.com", "123456"));
    }

    @Test
    public void testInvalidUsername() {
        UserRegistration ur = new UserRegistration();
        assertThrows(IllegalArgumentException.class, () -> ur.registerUser("", "john@example.com", "123456"));
    }

    @Test
    public void testInvalidEmail() {
        UserRegistration ur = new UserRegistration();
        assertThrows(IllegalArgumentException.class, () -> ur.registerUser("john", "johnexample.com", "123456"));
    }

    @Test
    public void testInvalidPassword() {
        UserRegistration ur = new UserRegistration();
        assertThrows(IllegalArgumentException.class, () -> ur.registerUser("john", "john@example.com", "123"));
    }
}
