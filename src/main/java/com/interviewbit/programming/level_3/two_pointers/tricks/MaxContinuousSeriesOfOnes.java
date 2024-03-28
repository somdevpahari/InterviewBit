package com.interviewbit.programming.level_3.two_pointers.tricks;

import java.util.ArrayList;

public class MaxContinuousSeriesOfOnes {
    public ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {
        ArrayList<Integer> sol = new ArrayList<>();

        int i = 0, j = 0, temp_st = -1, temp_end = -1, temp_count = 0;
        int ov_st = -1, ov_end = -1, ov_count = 0;

        int temp = B;

        while(j < A.size()){
            if(A.get(j) == 1){
                temp_count++;
                if(temp_count == 1){
                    temp_st = j;
                }
                temp_end = j;
                j++;
            }
            else{
                temp--;
                if(temp < 0){
                    int t_c = 1;
                    while(A.get(i) == 1){
                        i++;
                        t_c++;
                    }
                    i++;
                    temp_count = temp_count - t_c + 1;
                    temp = 0;
                    temp_st = i;
                    temp_end = j;
                }
                else{
                    temp_count++;
                    if(temp_count == 1){
                        temp_st = j;
                    }
                    temp_end = j;
                }
                j++;
            }
            if(ov_count == 0){
                ov_count = temp_count;
                ov_st = temp_st;
                ov_end = temp_end;
            }
            else{
                if(ov_count < temp_count){
                    ov_count = temp_count;
                    ov_st = temp_st;
                    ov_end = temp_end;
                }
            }
        }

        if(ov_count != 0){
            for(int t = ov_st; t <= ov_end; t++){
                sol.add(t);
            }
        }

        return sol;
    }
}
