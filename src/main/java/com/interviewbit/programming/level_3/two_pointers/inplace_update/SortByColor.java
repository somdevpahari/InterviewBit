package com.interviewbit.programming.level_3.two_pointers.inplace_update;

import java.util.ArrayList;

public class SortByColor {
    public void sortColors(ArrayList<Integer> A) {
        int lo = 0;
        int hi = A.size() - 1;
        int mid = 0;
        while (mid <= hi) {
            switch (A.get(mid)) {
                case 0:
                    swap(A, lo++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(A, mid, hi--);
                    break;
            }
        }
    }
    public void swap(ArrayList<Integer> A, int i, int j) {
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }
}
