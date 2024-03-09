package com.interviewbit.programming.level_3.binary_search.simple_binary_search;

import java.util.ArrayList;
import java.util.List;

public class SearchForARange {
    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        ArrayList<Integer> sol = new ArrayList<>();
        sol.add(binarySearch(A, B, true));
        sol.add(binarySearch(A, B, false));
        return sol;
    }

    public int binarySearch(final List<Integer> A, int key, boolean searchFirst) {
        int start = 0;
        int end = A.size() - 1;
        int mid;
        int result = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (A.get(mid) == key) {
                result = mid;
                if (searchFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (A.get(mid) > key) {
                end = mid - 1;
            } else { // A.get(mid) < key
                start = mid + 1;
            }
        }
        return result;
    }
}
