package com.interviewbit.programming.level_3.strings.string_simulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    LongestCommonPrefix longestCommonPrefix;
    @BeforeEach
    void setUp() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    void longestCommonPrefix() {
        ArrayList<String> A1 = new ArrayList<>(Arrays.asList("abcdefgh", "aefghijk", "abcefgh"));
        ArrayList<String> A2 = new ArrayList<>(Arrays.asList("abab", "ab", "abcd"));
        assertAll(
                () -> assertEquals("a", longestCommonPrefix.longestCommonPrefix(A1)),
                () -> assertEquals("ab", longestCommonPrefix.longestCommonPrefix(A2))
        );
    }
}