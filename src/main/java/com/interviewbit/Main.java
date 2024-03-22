package com.interviewbit;

import com.interviewbit.programming.level_2.arrays.examples.ArrayTwoD;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayTwoD arrayTwoD = new ArrayTwoD();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 2, 3, 4)),
                new ArrayList<>(Arrays.asList(5, 6, 7, 8)),
                new ArrayList<>(Arrays.asList(9, 10, 11, 12))
        ));

        ArrayList<ArrayList<Integer>> B = arrayTwoD.performOps(A);
        for (int i = 0; i < B.size(); i++) {
            for (int j = 0; j < B.get(i).size(); j++) {
                System.out.print(B.get(i).get(j) + " ");
            }
        }
        System.out.println();
        ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(5, 10, 2, 1));
        ArrayList<Integer> B1 = arrayTwoD.performOps1(A1);
        for (int i = 0; i < B1.size(); i++) {
            System.out.print(B1.get(i) + " ");
        }
    }
}