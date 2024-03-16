package com.interviewbit.programming.level_3.two_pointers.sorting;

import java.util.ArrayList;

public class Diffk {
    public int diffPossible(ArrayList<Integer> A, int B) {
        int i = 1, j = 0;

        if (A.isEmpty() || A.size() == 1) {
            return 0;
        }

        while ((i != A.size()) && (j != A.size())) {
            if (j == i) {
                i++;
                continue;
            }
            int diff = A.get(i) - A.get(j);
            if (diff == B) {
                return 1;
            } else if (diff < B) {
                i++;
            } else {
                j++;
            }
        }

        return 0;
    }
}
