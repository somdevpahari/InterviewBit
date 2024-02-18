package com.interviewbit.programming.level_3.strings.string_simulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountAndSayTest {
    CountAndSay countAndSay;

    @BeforeEach
    void setUp() {
        countAndSay = new CountAndSay();
    }

    @Test
    void countAndSay() {
        assertAll(
                () -> assertEquals("11", countAndSay.countAndSay(2))
        );
    }
}