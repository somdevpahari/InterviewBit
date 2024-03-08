package com.interviewbit.programming.level_3.bit_manipulation.bit_play;

public class ReverseBits {
    public long reverse(long A) {
        long num = 0;
        int bits = 31;
        int i = 0;
        while (A != 0) {
            num += (long) (Math.pow(2, bits - i) * (A % 2));
            A = A / 2;
            i++;
        }
        return num;
    }
}
