package com.JUnitTests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.JUnit.Password.PasswordValidator;

public class PasswordValidatorTest {

    @Test
    public void testValidPassword() {
        PasswordValidator validator = new PasswordValidator();
        assertTrue(validator.isValid("Abcdef12"));
    }

    @Test
    public void testInvalidPasswordTooShort() {
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.isValid("Ab12"));
    }

    @Test
    public void testInvalidPasswordNoUppercase() {
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.isValid("abcdef12"));
    }

    @Test
    public void testInvalidPasswordNoDigit() {
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.isValid("Abcdefgh"));
    }
}
