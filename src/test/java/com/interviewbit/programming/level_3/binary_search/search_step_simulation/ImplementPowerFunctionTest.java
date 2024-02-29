package com.interviewbit.programming.level_3.binary_search.search_step_simulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementPowerFunctionTest {

    ImplementPowerFunction implementPowerFunction;
    @BeforeEach
    void setUp() {
        implementPowerFunction = new ImplementPowerFunction();
    }

    @Test
    void pow() {
        assertAll(
                () -> assertEquals(2, implementPowerFunction.pow(2, 3, 3)),
                () -> assertEquals(1, implementPowerFunction.pow(5, 2, 6))
        );
    }
}