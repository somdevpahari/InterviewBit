package com.interviewbit.programming.level_3.strings.string_search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringOholicsTest {

    StringOholics stringOholics;
    @BeforeEach
    void setUp() {
        stringOholics = new StringOholics();
    }

    @Test
    void prod() {
    }

    @Test
    void timeTaken() {
    }

    @Test
    void makeSieve() {
    }

    @Test
    void separateFactors() {
    }

    @Test
    void oholics() {
        ArrayList<String> A1 = new ArrayList<>(Arrays.asList("a", "ababa", "aba"));
        ArrayList<String> A2 = new ArrayList<>(Arrays.asList("a", "aa"));
        ArrayList<String> A3 = new ArrayList<>(List.of("bbb"));

//        assertAll(
//                () -> assertEquals(4, stringOholics.oholics(A1)),
//                () -> assertEquals(1, stringOholics.oholics(A2)),
//                () -> assertEquals(1, stringOholics.oholics(A3))
//        );
    }

    @Test
    void solve() {
        ArrayList<String> A1 = new ArrayList<>(Arrays.asList("a", "ababa", "aba"));
        ArrayList<String> A2 = new ArrayList<>(Arrays.asList("a", "aa"));
        ArrayList<String> A3 = new ArrayList<>(List.of("bbb"));
        ArrayList<String> A4 = new ArrayList<>(List.of("abbaabba", "babbbab", "abbbaaab", "babbbabbaa", "bbbaaab", "a", "babba", "bbbaaaaa"));

        assertAll(
                () -> assertEquals(4, stringOholics.solve(A1)),
                () -> assertEquals(1, stringOholics.solve(A2)),
                () -> assertEquals(1, stringOholics.solve(A3)),
                () -> assertEquals(420, stringOholics.solve(A4))
        );
    }
}