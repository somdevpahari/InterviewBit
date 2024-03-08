package com.interviewbit.programming.level_3.bit_manipulation.bit_play;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideIntegersTest {

    DivideIntegers divideIntegers;
    @BeforeEach
    void setUp() {
        divideIntegers = new DivideIntegers();
    }

    @Test
    void divide() {
        assertAll(
                () -> assertEquals(2, divideIntegers.divide(5, 2))
        );
    }
}