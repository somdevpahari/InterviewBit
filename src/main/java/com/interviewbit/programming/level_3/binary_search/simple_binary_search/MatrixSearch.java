package com.interviewbit.programming.level_3.binary_search.simple_binary_search;

import java.util.List;

public class MatrixSearch {
    public int searchMatrix(List<List<Integer>> A, int B) {
        // Do not write main() function.
        // Do not read input, instead use the arguments to the function.
        // Do not print the output, instead return values as specified

        int rows = A.size();
        int cols = A.get(0).size();

        for (int i = 0; i < rows; i++) {
            if ((A.get(i).get(0) <= B) && (A.get(i).get(cols - 1) >= B)) {
                if (binarySearch(A.get(i), 0, cols - 1, B)) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }

        return 0;
    }

    public boolean binarySearch(List<Integer> A, int start, int end, int key) {
        int mid = start + (end - start) / 2;
        if (start <= end) {
            if (A.get(mid) == key) {
                return true;
            } else if (A.get(mid) > key) {
                return binarySearch(A, start, mid - 1, key);
            } else { // A.get(mid) < key
                return binarySearch(A, mid + 1, end, key);
            }
        }
        return false;
    }
}
