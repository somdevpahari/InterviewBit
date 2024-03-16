package com.interviewbit.programming.level_3.two_pointers.sorting;

import java.util.Arrays;

public class CountingTriangles {
    public int nTriang(int[] A) {
        // 2 pointer solution

        int ans = 0;
        int n = A.length;
        int num = (int) Math.pow(10, 9) + 7;

        if (n == 0) {
            return ans;
        }

        Arrays.sort(A);

        for (int k = n - 1; k >= 0; k--) {
            int i = 0;
            int j = k - 1;
            while (i < j) {
                long miniSum = (long) A[i] + A[j];
                long maxi = A[k];
                if (miniSum > maxi) {
                    ans = (int) ((ans + (j - i)) % num);
                    j--;
                } else {
                    i++;
                }
            }
        }

        return ans;
    }
}
