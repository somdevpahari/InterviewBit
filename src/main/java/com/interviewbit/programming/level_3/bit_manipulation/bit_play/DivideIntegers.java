package com.interviewbit.programming.level_3.bit_manipulation.bit_play;

public class DivideIntegers {
    public int divide(int a, int b) {
        if (a == 0) return 0;
        if (b == 0) return Integer.MAX_VALUE;

        int sign = ((a < 0) ^ (b < 0)) ? -1 : 1; // Determine sign of result

        // Remove sign of operands
        long t = 0, q = 0; // Using long to handle larger values
        long dividend = Math.abs((long) a);
        long divisor = Math.abs((long) b);

        for (int i = 31; i >= 0; --i) {
            if (t + (divisor << i) <= dividend) {
                t += divisor << i;
                q |= 1L << i;
            }
        }

        long result = sign * q;
        // Check for overflow and return result accordingly
        if (result >= Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            return (int) result;
        }
    }
}
