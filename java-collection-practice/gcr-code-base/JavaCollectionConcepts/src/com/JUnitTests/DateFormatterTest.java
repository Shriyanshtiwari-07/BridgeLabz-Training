package com.JUnitTests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.JUnit.DateFormatter.DateFormatter;

public class DateFormatterTest {

    @Test
    public void testValidDate() {
        DateFormatter df = new DateFormatter();
        assertEquals("25-12-2023", df.formatDate("2023-12-25"));
    }

    @Test
    public void testInvalidDate() {
        DateFormatter df = new DateFormatter();
        assertThrows(IllegalArgumentException.class, () -> df.formatDate("12-25-2023"));
    }
}
