package com.JUnitTests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.JUnit.stringutility.StringUtils;

public class StringUtilsTest {

    @Test
    public void testReverse() {
        StringUtils utils = new StringUtils();
        assertEquals("olleh", utils.reverse("hello"));
    }

    @Test
    public void testIsPalindromeTrue() {
        StringUtils utils = new StringUtils();
        assertTrue(utils.isPalindrome("madam"));
    }

    @Test
    public void testIsPalindromeFalse() {
        StringUtils utils = new StringUtils();
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    public void testToUpperCase() {
        StringUtils utils = new StringUtils();
        assertEquals("HELLO", utils.toUpperCase("hello"));
    }
}
