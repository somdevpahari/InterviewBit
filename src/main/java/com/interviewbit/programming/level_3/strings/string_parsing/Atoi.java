package com.interviewbit.programming.level_3.strings.string_parsing;

public class Atoi {
    public boolean isNumeric(char ch) {
        return (ch >= '0' && ch <= '9');
    }

    public int atoi(final String A) {
        int res = 0, sign = 1, i = 0;

        while (i < A.length() && A.charAt(i) == ' ') {
            i++;
        }

        if (i < A.length() && (A.charAt(i) == '-' || A.charAt(i) == '+')) {
            if (A.charAt(i++) == '-') {
                sign = -1;
            }
        }

        while (i < A.length() && isNumeric(A.charAt(i))) {
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && A.charAt(i) - '0' > 7)) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            res = res * 10 + (A.charAt(i++) - '0');
        }

        return sign * res;
    }
}
