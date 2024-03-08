package com.interviewbit.programming.level_3.bit_manipulation.bit_play;

import java.util.ArrayList;

public class DifferentBitsSumPairwise {
    public int cntBits(ArrayList<Integer> A) {
        final int MOD = 1000000007;
        long ans = 0;

        for (int i = 0; i < 31; i++) {
            int count = 0;
            for (int j = 0; j < A.size(); j++) {
                if ((A.get(j) & (1 << i)) != 0) {
                    count++;
                }
            }
            ans = (ans + (2L * count * (A.size() - count))) % MOD;
        }

        return (int) ans;
    }
}
