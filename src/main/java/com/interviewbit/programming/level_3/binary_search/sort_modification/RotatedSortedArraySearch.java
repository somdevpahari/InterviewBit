package com.interviewbit.programming.level_3.binary_search.sort_modification;

import java.util.List;

public class RotatedSortedArraySearch {
    public int search1(List<Integer> arr, int low, int high, int B) {
        if (low > high) return -1;

        int mid = low + (high - low) / 2;
        if (arr.get(mid) == B) return mid;

        if (arr.get(low) <= arr.get(mid)) {
            if (B >= arr.get(low) && B <= arr.get(mid))
                return search1(arr, low, mid - 1, B);

            return search1(arr, mid + 1, high, B);
        } else if (arr.get(mid) <= arr.get(high)) {
            if (B >= arr.get(mid) && B <= arr.get(high))
                return search1(arr, mid + 1, high, B);

            return search1(arr, low, mid - 1, B);
        }
        return -1;
    }

    public int search(List<Integer> A, int B) {
        int n = A.size();
        return search1(A, 0, n - 1, B);
    }
}
