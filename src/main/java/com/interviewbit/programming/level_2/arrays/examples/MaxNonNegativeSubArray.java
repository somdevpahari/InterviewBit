package com.interviewbit.programming.level_2.arrays.examples;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        int lastIndex = -1;
        int sizeOfSubArray = 0;
        long maxSumOfSubArray = Integer.MIN_VALUE;
        long sum = 0;
        int index;
        int size = 0;

        for (int i = 0; i < A.size(); i++) {
            int ele = A.get(i);
            if (ele >= 0) {
                sum += ele;
                index = i;
                size += 1;
                if (sum > maxSumOfSubArray) {
                    maxSumOfSubArray = sum;
                    sizeOfSubArray = size;
                    lastIndex = index;
                } else if (sum == maxSumOfSubArray) {
                    if (size > sizeOfSubArray) {
                        sizeOfSubArray = size;
                        lastIndex = index;
                    }
                }
            } else {
                sum = 0;
                size = 0;
            }
        }

        for (int i = lastIndex - sizeOfSubArray + 1; i <= lastIndex; i++) {
            result.add(A.get(i));
        }
        return result;
    }
}
