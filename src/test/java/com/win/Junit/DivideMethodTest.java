package com.win.Junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.win.junit.DivideMethod;

class DivideMethodTest {

    // Test 6

    @DisplayName("Test divide() method- if output is not equal to expected")
    @Test
    void testDivide() {

        assertNotEquals(1, DivideMethod.divide(1, 3));
    }

    // Test 7

    @DisplayName("Test divide() method - if output is equal to expected")
    @Test
    void testDivide1() {

        assertEquals(2.5, DivideMethod.divide(5, 2));

    }

}
