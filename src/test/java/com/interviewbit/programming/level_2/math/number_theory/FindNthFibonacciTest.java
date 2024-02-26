package com.interviewbit.programming.level_2.math.number_theory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNthFibonacciTest {

    FindNthFibonacci findNthFibonacci;
    @BeforeEach
    void setUp() {
        findNthFibonacci = new FindNthFibonacci();
    }

    @Test
    void getNthFib() {
        assertAll(
                () -> assertEquals(1, findNthFibonacci.getNthFib(1)),
                () -> assertEquals(1, findNthFibonacci.getNthFib(2)),
                () -> assertEquals(2, findNthFibonacci.getNthFib(3)),
                () -> assertEquals(3, findNthFibonacci.getNthFib(4)),
                () -> assertEquals(5, findNthFibonacci.getNthFib(5)),
                () -> assertEquals(517691607, findNthFibonacci.getNthFib(1000)),
                () -> assertEquals(999999918, findNthFibonacci.getNthFib(999999997))
        );
    }

    @Test
    void matrixMultiply() {
    }

    @Test
    void matrixPower() {
    }

    @Test
    void nthFibonacciModuloA() {
        assertAll(
                () -> assertEquals(1, findNthFibonacci.nthFibonacciModuloA(1)),
                () -> assertEquals(1, findNthFibonacci.nthFibonacciModuloA(2)),
                () -> assertEquals(2, findNthFibonacci.nthFibonacciModuloA(3)),
                () -> assertEquals(3, findNthFibonacci.nthFibonacciModuloA(4)),
                () -> assertEquals(5, findNthFibonacci.nthFibonacciModuloA(5)),
                () -> assertEquals(517691607, findNthFibonacci.nthFibonacciModuloA(1000)),
                () -> assertEquals(999999918, findNthFibonacci.nthFibonacciModuloA(999999997))
        );
    }
}