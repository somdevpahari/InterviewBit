package com.interviewbit.programming.level_3.strings.string_parsing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareVersionNumbersTest {

    CompareVersionNumbers compareVersionNumbers;
    @BeforeEach
    void setUp() {
        compareVersionNumbers = new CompareVersionNumbers();
    }

    @Test
    void extract() {
    }

    @Test
    void rem() {
    }

    @Test
    void compareStr() {
    }

    @Test
    void compareVersion() {
        assertAll(
                () -> assertEquals(-1, compareVersionNumbers.compareVersion("1.13", "1.13.4"))
        );
    }
}