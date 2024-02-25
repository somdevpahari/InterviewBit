package com.interviewbit.programming.level_3.strings.string_simulation;

import java.util.ArrayList;

public class LongestCommonPrefix {
    public String longestCommonPrefix(ArrayList<String> A) {
        String tempOverallMax = "", overallMax = "", tempMax;
        int maxLength = -1, tempLength;

        for (int i = 0; i < A.size(); i++) {
            if (i == 0) {
                tempOverallMax = A.get(i);
                overallMax = A.get(i);
                maxLength = A.get(i).length();
            }

            tempOverallMax = overallMax;

            tempMax = A.get(i);
            tempLength = A.get(i).length();

            int checkLength = tempLength;

            if (tempLength >= maxLength) {
                checkLength = maxLength;
            }

            maxLength = 0;
            overallMax = "";

            for (int j = 0; j < checkLength; j++) {
                char c = tempOverallMax.charAt(j);
                char a = tempMax.charAt(j);
                if (c == a) {
                    maxLength++;
                    overallMax += a;
                } else {
                    break;
                }
            }
        }

        return overallMax;
    }
}
