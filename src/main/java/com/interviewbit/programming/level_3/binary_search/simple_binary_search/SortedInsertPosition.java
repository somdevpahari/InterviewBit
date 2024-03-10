package com.interviewbit.programming.level_3.binary_search.simple_binary_search;

import java.util.List;

public class SortedInsertPosition {
    public int searchInsert(List<Integer> A, int B) {
        int upper, lower, key, position = 0;

        lower = 0;
        upper = A.size() - 1;
        key = B;

        if (A.get(upper) < key) {
            return A.size();
        } else if (A.get(0) > key) {
            return 0;
        } else {
            position = binary(lower, upper, key, A);
        }
        return position;
    }

    public int binary(int lower, int upper, int key, List<Integer> A) {
        int mid = (upper + lower) / 2;

        if (lower <= upper) {
            if (key > A.get(mid)) {
                lower = mid + 1;
                return binary(lower, upper, key, A);
            } else if (key < A.get(mid)) {
                upper = mid - 1;
                return binary(lower, upper, key, A);
            }
        } else {
            if (key == A.get(mid)) {
                return mid;
            } else if (key > A.get(mid)) {
                return mid + 1;
            } else if (key < A.get(mid)) {
                return mid;
            }
        }
        return mid;
    }
}
