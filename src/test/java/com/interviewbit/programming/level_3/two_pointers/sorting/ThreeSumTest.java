package com.interviewbit.programming.level_3.two_pointers.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    ThreeSum threeSum;
    @BeforeEach
    void setUp() {
        threeSum = new ThreeSum();
    }

    @Test
    void threeSumClosest() {
        ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(-1, 2, 1, -4));
        ArrayList<Integer> A2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertAll(
                () -> assertEquals(2, threeSum.threeSumClosest(A1, 1)),
                () -> assertEquals(6, threeSum.threeSumClosest(A2, 6))
        );
    }
}