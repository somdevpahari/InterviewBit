package com.interviewbit.programming.level_3.strings.string_tricks;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String A) {
        int start = 0;
        int length = A.length();
        int maxLen = 1;

        int low, high;

        for (int i = 0; i < length; i++) {
            low = i - 1;
            high = i;
            while (low >= 0 && high < length && A.charAt(low) == A.charAt(high)) {
                if ((high - low + 1) > maxLen) {
                    maxLen = high - low + 1;
                    start = low;
                }
                low--;
                high++;
            }

            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < length && A.charAt(low) == A.charAt(high)) {
                if ((high - low + 1) > maxLen) {
                    maxLen = high - low + 1;
                    start = low;
                }
                low--;
                high++;
            }
        }

        StringBuilder sol = new StringBuilder();
        high = start + maxLen;
        while (start != high) {
            sol.append(A.charAt(start));
            start++;
        }

        return sol.toString();
    }
}
