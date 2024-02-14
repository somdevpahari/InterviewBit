package com.interviewbit.programming.level_3.strings.string_parsing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtoiTest {

    Atoi atoi;
    @BeforeEach
    void setUp() {
        atoi = new Atoi();
    }

    @Test
    void isNumeric() {
        assertAll(
                () -> assertTrue(atoi.isNumeric('9')),
                () -> assertFalse(atoi.isNumeric(' '))
        );
    }

    @Test
    void atoi() {
        assertAll(
                () -> assertEquals(9, atoi.atoi("9 2704")),
                () -> assertEquals(5632, atoi.atoi("5632"))
        );
    }
}