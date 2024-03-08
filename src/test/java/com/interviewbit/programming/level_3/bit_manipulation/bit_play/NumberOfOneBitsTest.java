package com.interviewbit.programming.level_3.bit_manipulation.bit_play;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfOneBitsTest {

    NumberOfOneBits numberOfOneBits;
    @BeforeEach
    void setUp() {
        numberOfOneBits = new NumberOfOneBits();
    }

    @Test
    void numSetBits() {
        assertAll(
                () -> assertEquals(3, numberOfOneBits.numSetBits(11))
        );
    }
}