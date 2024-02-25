package com.interviewbit.programming.level_3.strings.string_math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest {

    PowerOfTwo powerOfTwo;
    @BeforeEach
    void setUp() {
        powerOfTwo = new PowerOfTwo();
    }

    @Test
    void multiplyByTwo() {
    }

    @Test
    void compareString() {
    }

    @Test
    void power() {
        assertAll(
                () -> assertEquals(1, powerOfTwo.power("128")),
                () -> assertEquals(0, powerOfTwo.power("7"))
        );
    }
}