package com.interviewbit.programming.level_3.binary_search.examples;

import java.util.List;

public class RotatedArray {
    public int findMin(final List<Integer> a) {
        return binarySearch(a);
    }

    public int binarySearch(List<Integer> A) {
        int start = 0;
        int end = A.size() - 1;
        int mid;
        int n = A.size();
        while (start <= end) {
            mid = start + (end - start) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;
            if (A.get(start) <= A.get(end)) {
                return A.get(start);
            } else if ((A.get(mid) <= A.get(prev)) && (A.get(mid) <= A.get(next))) {
                return A.get(mid);
            } else if (A.get(mid) <= A.get(end)) {
                end = mid - 1;
            } else { // A[mid] >= A[start]
                start = mid + 1;
            }
        }
        return -1;
    }
}
