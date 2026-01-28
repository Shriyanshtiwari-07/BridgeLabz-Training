package com.JUnitTests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.JUnit.parametrizedtests.EvenChecker;

public class EvenCheckerTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    public void testIsEven(int number) {
        EvenChecker checker = new EvenChecker();
        if (number % 2 == 0) {
            assertTrue(checker.isEven(number));
        } else {
            assertFalse(checker.isEven(number));
        }
    }
}
