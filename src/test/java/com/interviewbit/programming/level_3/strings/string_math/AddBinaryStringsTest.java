package com.interviewbit.programming.level_3.strings.string_math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryStringsTest {

    AddBinaryStrings addBinaryStrings;
    @BeforeEach
    void setUp() {
        addBinaryStrings = new AddBinaryStrings();
    }

    @Test
    void addBinary() {
        assertAll(
                () -> assertEquals("1011", addBinaryStrings.addBinary("1000", "11")),
                () -> assertEquals("1010", addBinaryStrings.addBinary("1001", "1"))
        );
    }
}