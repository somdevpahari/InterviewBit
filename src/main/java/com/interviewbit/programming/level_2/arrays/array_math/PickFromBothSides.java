package com.interviewbit.programming.level_2.arrays.array_math;

import java.util.ArrayList;

public class PickFromBothSides {
    public int pickFromBothSides(ArrayList<Integer> A, int B) {
        int sizeOfA = A.size();
        int sumOfLastBElements = 0;
        for (int i = sizeOfA - B; i < sizeOfA; i++) {
            sumOfLastBElements += A.get(i);
        }

        int maxSumOfBElements = sumOfLastBElements;
        int currentSum = sumOfLastBElements;
        for (int i = 0; i <  B; i++) {
            currentSum += (A.get(i) - A.get(i + sizeOfA - B));
            if (currentSum > maxSumOfBElements) maxSumOfBElements = currentSum;
        }

        return maxSumOfBElements;
    }
}
