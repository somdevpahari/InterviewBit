package com.interviewbit.programming.level_3.two_pointers.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThreeSum {
    public int threeSumClosest(int[] A, int B) {
        if (A.length < 3) {
            return 0;
        }

        Arrays.sort(A);

        int i = 0;
        int sum = 0;
        int minDiff = Integer.MAX_VALUE;

        while (i < A.length - 2) {
            int left = i + 1;
            int right = A.length - 1;
            while (right > left) {
                int temp = A[i] + A[left] + A[right];
                int diff = Math.abs(temp - B);
                if (diff == 0) {
                    return B;
                }
                if (diff < minDiff) {
                    minDiff = diff;
                    sum = temp;
                }
                if (temp < B) {
                    left++;
                } else {
                    right--;
                }
            }
            i++;
        }

        return sum;
    }

    public int threeSumClosest(ArrayList<Integer> A, int B) {
        if (A.size() < 3) {
            return 0;
        }

        Collections.sort(A);

        int i = 0;
        int sum = 0;
        int minDiff = Integer.MAX_VALUE;

        while (i < A.size() - 2) {
            int left = i + 1;
            int right = A.size() - 1;
            while (right > left) {
                int temp = A.get(i) + A.get(left) + A.get(right);
                int diff = Math.abs(temp - B);
                if (diff == 0) {
                    return B;
                }
                if (diff < minDiff) {
                    minDiff = diff;
                    sum = temp;
                }
                if (temp < B) {
                    left++;
                } else {
                    right--;
                }
            }
            i++;
        }

        return sum;
    }
}
