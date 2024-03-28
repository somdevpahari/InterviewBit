package com.interviewbit.programming.level_3.two_pointers.inplace_update;

import java.util.ArrayList;

public class RemoveElementFromArray {
    public int removeElement(ArrayList<Integer> A, int B) {
        int i = 0;
        int length = A.size();

        while (i < A.size()) {
            if (A.get(i) == B) {
                break;
            }
            i++;
        }

        if (i == length) {
            return length;
        }

        int j = i + 1;

        while (j < length) {
            if (A.get(j) != B) {
                A.set(i, A.get(j));
                i++;
            }
            j++;
        }

        while (i < length) {
            A.remove(A.size() - 1);
            i++;
        }

        return A.size();
    }
}
