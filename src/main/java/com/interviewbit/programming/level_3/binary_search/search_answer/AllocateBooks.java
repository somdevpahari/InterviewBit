package com.interviewbit.programming.level_3.binary_search.search_answer;

import java.util.ArrayList;
import java.util.List;

public class AllocateBooks {
    public int books(ArrayList<Integer> A, int B) {
        if (A.size() < B) return -1;

        int l = getMax(A);
        int h = getSum(A);

        while (l < h) {
            int mid = l + (h - l) / 2;
            int reqStuds = getReqStuds(A, mid);
            if (reqStuds <= B)
                h = mid;
            else
                l = mid + 1;
        }

        return l;
    }

    private int getMax(List<Integer> A) {
        int max = Integer.MIN_VALUE;
        for (Integer integer : A) {
            if (integer > max)
                max = integer;
        }
        return max;
    }

    private int getSum(List<Integer> A) {
        int sum = 0;
        for (Integer integer : A) sum += integer;
        return sum;
    }

    private int getReqStuds(List<Integer> A, int maxPagePerStud) {
        int tot = 0;
        int numStuds = 1;
        for (Integer integer : A) {
            tot += integer;
            if (tot > maxPagePerStud) {
                tot = integer;
                numStuds++;
            }
        }
        return numStuds;
    }
}
