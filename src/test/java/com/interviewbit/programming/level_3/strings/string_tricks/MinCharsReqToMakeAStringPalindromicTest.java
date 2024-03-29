package com.interviewbit.programming.level_3.strings.string_tricks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCharsReqToMakeAStringPalindromicTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void lpsArray() {
    }

    @Test
    void minReqPalindromic() {
        assertAll(
                () -> assertEquals(2, MinCharsReqToMakeAStringPalindromic.minReqPalindromic("ABC")),
                () -> assertEquals(2, MinCharsReqToMakeAStringPalindromic.minReqPalindromic("AACECAAAA"))
        );
    }
}