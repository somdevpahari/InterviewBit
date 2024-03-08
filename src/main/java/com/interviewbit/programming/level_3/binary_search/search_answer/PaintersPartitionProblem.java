package com.interviewbit.programming.level_3.binary_search.search_answer;

import java.util.ArrayList;

public class PaintersPartitionProblem {
    public int paint(int A, int B, ArrayList<Integer> C) {
        long start = 0, end = 0;

        for(int i = 0; i < C.size(); i++){
            end = end + C.get(i);
        }

        long sol = Integer.MAX_VALUE;

        while(start <= end){
            long mid = start + (end - start) / 2;
            if(isPossible(mid, C, A)){
                sol = Math.min(sol, mid);
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return (int)((sol * (long)B) % 10000003);
    }

    public boolean isPossible(long mid, ArrayList<Integer> C, int paint){
        int maxi = 0;
        for(int i = 0; i < C.size(); i++){
            if(C.get(i) > maxi){
                maxi = C.get(i);
            }
        }

        if(maxi > mid){
            return false;
        }

        long sum = 0;
        int count = 1;

        for(int i = 0; i < C.size();){
            if((sum + (long)C.get(i)) > mid){
                count++;
                sum = 0;
            }
            else{
                sum = sum + (long)C.get(i);
                i++;
            }
        }

        if(count <= paint){
            return true;
        }

        return false;
    }
}
