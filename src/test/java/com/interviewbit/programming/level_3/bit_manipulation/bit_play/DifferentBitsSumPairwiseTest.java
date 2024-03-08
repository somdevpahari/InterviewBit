package com.interviewbit.programming.level_3.bit_manipulation.bit_play;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DifferentBitsSumPairwiseTest {

    DifferentBitsSumPairwise differentBitsSumPairwise;
    @BeforeEach
    void setUp() {
        differentBitsSumPairwise = new DifferentBitsSumPairwise();
    }

    @Test
    void cntBits() {
        ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(1, 3, 5));
        ArrayList<Integer> A2 = new ArrayList<>(Arrays.asList(2, 3));
        assertAll(
                () -> assertEquals(8, differentBitsSumPairwise.cntBits(A1)),
                () -> assertEquals(2, differentBitsSumPairwise.cntBits(A2))
        );
    }
}