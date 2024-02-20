package com.interviewbit.programming.level_3.strings.words;

public class LengthOfLastWord {
    public int lengthOfLastWord(final String A) {
        int length = 0;
        for (int i = A.length() - 1; i >= 0; i--) {
            char c = A.charAt(i);
            if (Character.isWhitespace(c)) {
                if (length != 0) {
                    return length;
                } else {
                    length = 0;
                }
            } else {
                length++;
            }
        }
        return length;
    }
}
