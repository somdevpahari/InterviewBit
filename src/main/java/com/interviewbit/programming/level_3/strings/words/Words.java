package com.interviewbit.programming.level_3.strings.words;

public class Words {
    public String reverseWords(String A) {
        char[] chars = A.toCharArray();

        // Reverse the entire string
        reverse(chars, 0, chars.length - 1);

        int storeIdx = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                if (storeIdx != 0)
                    chars[storeIdx++] = ' ';

                int j = i;
                while (j < chars.length && chars[j] != ' ')
                    chars[storeIdx++] = chars[j++];

                // Reverse the word
                reverse(chars, storeIdx - (j - i), storeIdx - 1);
                i = j;
            }
        }

        // Truncate the result to remove extra spaces at the end
        return new String(chars, 0, storeIdx);
    }

    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
