package com.interviewbit.programming.level_3.strings.string_math;

/*

    Medium
    Asked in Amazon, Facebook, and Microsoft

    https://www.interviewbit.com/problems/roman-to-integer/

    Given a string A representing a roman numeral.
    Convert A into integer.
    A is guaranteed to be within the range from 1 to 3999.
    NOTE: Read more
    details about roman numerals at Roman Numeric System

    Input Format
    The only argument given is string A.

    Output Format
    Return an integer which is the integer verison of roman numeral string.

    For Example
    Input 1:
        A = "XIV"
    Output 1:
        14

    Input 2:
        A = "XX"
    Output 2:
        20

 */

public class RomanToInteger {
    public int romanToIntV1(String A) {
        int res = 0;

        for (int i = 0; i < A.length(); i++) {
            int s1 = val(A.charAt(i));

            if (i + 1 < A.length()) {
                int s2 = val(A.charAt(i + 1));
                if (s1 >= s2)
                    res += s1;
                else {
                    res += (s2 - s1);
                    i++;
                }
            } else {
                res += s1;
                i++;
            }
        }

        return res;
    }

    private int val(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;

        return -1;
    }

    public int romanToIntV2(String s) {
        int res = 0;
        int size = s.length();

        for (int i = 0; i < size; i++) {
            // Does lesser value precede higher value ?
            if (i < (size - 1) && romanCharToInt(s.charAt(i)) < romanCharToInt(s.charAt(i + 1))) {
                res -= romanCharToInt(s.charAt(i));
            } else {
                res += romanCharToInt(s.charAt(i));
            }
        }

        return res;
    }

    // Helper method to convert Roman characters to integers
    private int romanCharToInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

}
