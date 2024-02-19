package com.interviewbit.programming.level_3.strings.string_search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementStrStrTest {
    ImplementStrStr implementStrStr;

    @BeforeEach
    void setUp() {
        implementStrStr = new ImplementStrStr();
    }

    @Test
    void strStr() {
        assertAll(
                () -> assertEquals(0, implementStrStr.strStr("strstr", "str")),
                () -> assertEquals(-1, implementStrStr.strStr("bighit", "bit"))
        );
    }
}