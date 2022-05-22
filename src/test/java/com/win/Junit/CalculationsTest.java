package com.win.Junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.win.junit.Calculations;



class CalculationsTest {

    // Test 4

    @DisplayName("Test addition() method")
    @Test
    void testaddition() {
        assertEquals(13, Calculations.addition(6,7));
    }

    // Test 5

    @DisplayName("Test multiplication() method")
    @Test
    void testmultiplication() {
        assertNotEquals(45, Calculations.multiplication(6,7));
    }


}
