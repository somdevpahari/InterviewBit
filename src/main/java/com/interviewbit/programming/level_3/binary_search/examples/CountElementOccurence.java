package com.interviewbit.programming.level_3.binary_search.examples;

import java.util.List;

public class CountElementOccurence {
    public int findCount(final List<Integer> A, int B) {
        if (binarySearch(A, 0, A.size() - 1, B, true) == -1) {
            return 0;
        }
        return binarySearch(A, 0, A.size() - 1, B, false) - binarySearch(A, 0, A.size() - 1, B, true) + 1;

    }

    public int binarySearch(List<Integer> A, int start, int end, int key, boolean searchFirst) {
        int result = -1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (A.get(mid) == key) {
                result = mid;
                if (searchFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (A.get(mid) < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}
