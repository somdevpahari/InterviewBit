package com.interviewbit.programming.level_2.arrays.simulation_array;

import java.util.ArrayList;

public class PascalTriangle {
    public ArrayList<ArrayList<Integer>> generate(int A) {
        ArrayList<ArrayList<Integer>> tri = new ArrayList<>();

        for (int i = 0; i < A; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(compute(i, j));
            }
            tri.add(row);
        }

        return tri;
    }

    private int compute(int line, int index) {
        if (index == 0) {
            return 1;
        } else {
            return compute(line, index - 1) * (line - index + 1) / index;
        }
    }
}
