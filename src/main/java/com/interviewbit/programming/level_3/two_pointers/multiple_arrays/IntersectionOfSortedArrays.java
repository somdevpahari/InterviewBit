package com.interviewbit.programming.level_3.two_pointers.multiple_arrays;

import java.util.ArrayList;

public class IntersectionOfSortedArrays {
    public ArrayList<Integer> intersect(final ArrayList<Integer> A, final ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> sol = new ArrayList<>();

        while (i < A.size() && j < B.size()) {
            if (A.get(i) > B.get(j)) {
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                sol.add(A.get(i));
                i++;
                j++;
            }
        }

        return sol;
    }
}
