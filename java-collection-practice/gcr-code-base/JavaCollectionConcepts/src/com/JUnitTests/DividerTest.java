package com.JUnitTests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.JUnit.exceptionhandling.Divider;

public class DividerTest {

    @Test
    public void testDivideException() {
        Divider d = new Divider();
        assertThrows(ArithmeticException.class, () -> d.divide(10, 0));
    }

    @Test
    public void testDivideNormal() {
        Divider d = new Divider();
        assertEquals(5, d.divide(10, 2));
    }
}
