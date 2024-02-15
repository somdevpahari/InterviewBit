package com.interviewbit.programming.level_3.strings.string_tricks;

public class MinCharsReqToMakeAStringPalindromic {
    public static int[] lpsArray(String s) {
        int n = s.length();
        int j = 0;
        int i = 1;
        int[] lps = new int[n];
        lps[0] = 0;

        while (i < n) {
            if (s.charAt(i) == s.charAt(j)) {
                lps[i] = j + 1;
                i++;
                j++;
            } else if (j > 0) {
                j = lps[j - 1];
            } else {
                lps[i] = 0;
                i++;
            }
        }
        return lps;
    }

    public static int minReqPalindromic(String A) {
        StringBuilder sb = new StringBuilder(A);
        String B = sb.reverse().toString();

        String concat = A + "$" + B;

        int[] lps = lpsArray(concat);

        return (A.length() - lps[lps.length - 1]);
    }
}
