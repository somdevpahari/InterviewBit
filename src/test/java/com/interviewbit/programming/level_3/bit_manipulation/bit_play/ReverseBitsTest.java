package com.interviewbit.programming.level_3.bit_manipulation.bit_play;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseBitsTest {

    ReverseBits reverseBits;
    @BeforeEach
    void setUp() {
        reverseBits = new ReverseBits();
    }

    @Test
    void reverse() {
        assertAll(
                () -> assertEquals(0, reverseBits.reverse(0)),
                () -> assertEquals(3221225472L, reverseBits.reverse(3))
        );
    }
}