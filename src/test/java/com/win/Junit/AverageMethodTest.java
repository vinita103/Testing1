package com.win.Junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.win.junit.AverageMethod;;

// Test 1

public class AverageMethodTest {

    @DisplayName("test average() method- if it returns average" )
    @Test
    void averageTest() {

        assertEquals(4, AverageMethod.average(3, 4, 5));

    }

}
