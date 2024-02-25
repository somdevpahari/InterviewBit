package com.interviewbit.programming.level_3.strings.string_tricks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    LongestPalindromicSubstring longestPalindromicSubstring;
    @BeforeEach
    void setUp() {
        longestPalindromicSubstring = new LongestPalindromicSubstring();
    }

    @Test
    void longestPalindrome() {
        assertAll(
                () -> assertEquals("aaabaaa", longestPalindromicSubstring.longestPalindrome("aaaabaaa"))
        );
    }
}