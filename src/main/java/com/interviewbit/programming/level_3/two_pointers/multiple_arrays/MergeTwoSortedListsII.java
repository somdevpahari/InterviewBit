package com.interviewbit.programming.level_3.two_pointers.multiple_arrays;

import java.util.ArrayList;

public class MergeTwoSortedListsII {
    public void merge(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            boolean a = checkGreater(A.get(i), B.get(j));
            if (a) {
                A.add(i, B.get(j));
                i++;
                j++;
            } else {
                i++;
            }
        }
        while (j != B.size()) {
            A.add(B.get(j));
            j++;
        }
    }
    public boolean checkGreater(int A, int B) {
        if (A > B) {
            return true;
        }
        return false;
    }
}
