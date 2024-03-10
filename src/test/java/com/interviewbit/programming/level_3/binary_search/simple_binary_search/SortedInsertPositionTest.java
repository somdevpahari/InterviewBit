package com.interviewbit.programming.level_3.binary_search.simple_binary_search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortedInsertPositionTest {
    SortedInsertPosition sortedInsertPosition;
    @BeforeEach
    void setUp() {
        sortedInsertPosition = new SortedInsertPosition();
    }

    @Test
    void searchInsert() {
        ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(1, 3, 5, 6));
        assertAll(
                () -> assertEquals(2, sortedInsertPosition.searchInsert(A1, 5)),
                () -> assertEquals(1, sortedInsertPosition.searchInsert(A1, 2))
        );
    }

    @Test
    void binary() {
    }
}