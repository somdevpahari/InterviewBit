package com.interviewbit.programming.level_3.strings.string_math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {

    IntegerToRoman integerToRoman;
    @BeforeEach
    void setUp() {
        integerToRoman = new IntegerToRoman();
    }

    @Test
    void intToRoman() {
        assertAll(
                () -> assertEquals("IV", integerToRoman.intToRoman(4)),
                () -> assertEquals("X", integerToRoman.intToRoman(10))
        );
    }
}