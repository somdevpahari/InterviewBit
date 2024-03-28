package com.interviewbit.programming.level_3.two_pointers.inplace_update;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(ArrayList<Integer> a) {
        int start = 0;
        int end = 0;
        int n = a.size();
        while (end < n) {
            int num = a.get(end);
            int count = 0;
            while (end < n && a.get(end) == num) {
                end++;
                count++;
            }
            for (int i = 0; i < Math.min(count, 2); i++) {
                a.set(start++, num);
            }
        }
        return start;
    }
}
