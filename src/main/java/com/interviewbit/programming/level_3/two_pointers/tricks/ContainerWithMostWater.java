package com.interviewbit.programming.level_3.two_pointers.tricks;

import java.util.ArrayList;

public class ContainerWithMostWater {
    public int maxArea(ArrayList<Integer> A) {
        int i = 0;
        int j = A.size() - 1;
        int ans = 0;

        while (i < A.size()) {
            int curr = 0;
            if (A.get(i) <= A.get(j)) {
                curr = (j - i) * A.get(i);
                i++;
            } else {
                curr = (j - i) * A.get(j);
                j--;
            }
            if (curr > ans) {
                ans = curr;
            }
            if (i == j) {
                break;
            }
        }

        return ans;
    }
}
