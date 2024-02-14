package com.interviewbit.programming.level_3.strings.string_math;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("When running test cases for")
class RomanToIntegerTest {

    RomanToInteger romanToInteger;
    TestInfo testInfo;
    TestReporter testReporter;

    @BeforeEach
    void setUp(TestInfo testInfo, TestReporter testReporter) {
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        romanToInteger = new RomanToInteger();
        testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tag " + testInfo.getTags());
    }

    @Test
    @Tag("RomanToInteger")
    @DisplayName("Roman to Integer V1")
    void romanToIntV1() {
        assertAll(
                () -> assertEquals(14, romanToInteger.romanToIntV1("XIV"), "XIV should return 14"),
                () -> assertEquals(20, romanToInteger.romanToIntV1("XX"), "XX should return 20"),
                () -> assertEquals(10, romanToInteger.romanToIntV1("X"), "X should return 10"),
                () -> assertEquals(5, romanToInteger.romanToIntV1("V"), "V should return 5")
        );
    }

    @Test
    @Tag("RomanToInteger")
    @DisplayName("Roman to Integer V2")
    void romanToIntV2() {
        assertAll(
                () -> assertEquals(14, romanToInteger.romanToIntV2("XIV"), "XIV should return 14"),
                () -> assertEquals(20, romanToInteger.romanToIntV2("XX"), "XX should return 20"),
                () -> assertEquals(10, romanToInteger.romanToIntV2("X"), "X should return 10"),
                () -> assertEquals(5, romanToInteger.romanToIntV2("V"), "V should return 5")
        );
    }
}