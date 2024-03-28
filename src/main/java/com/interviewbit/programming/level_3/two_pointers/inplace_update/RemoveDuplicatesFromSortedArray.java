package com.interviewbit.programming.level_3.two_pointers.inplace_update;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(ArrayList<Integer> A) {
        if (A.isEmpty()) {
            return 0;
        }
        int k = 0;
        for (int i = 1; i < A.size(); i++) {
            if (!A.get(k).equals(A.get(i))) {
                A.set(++k, A.get(i));
            }
        }
        // Remove the duplicates from index k+1 onwards
        while (A.size() > k + 1) {
            A.remove(A.size() - 1);
        }
        return k + 1;
    }
}
