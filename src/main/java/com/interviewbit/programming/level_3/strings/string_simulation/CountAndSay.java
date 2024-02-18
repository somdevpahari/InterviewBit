package com.interviewbit.programming.level_3.strings.string_simulation;
/*

https://www.interviewbit.com/problems/count-and-say/

Easy
Asked In: Facebook, Amazon, and Microsoft

Problem Description

The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...
1 is read off as one 1 or 11. 11 is read off as two 1s or 21.
21 is read off as one 2, then one 1 or 1211.

Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.

Example:

if n = 2, the sequence is 11.

 */
public class CountAndSay {
    public String countAndSay(int A) {
        String str = "11";
        int count = 1;
        StringBuilder sb = new StringBuilder();

        if (A == 1) {
            return "1";
        }

        while (A != 2) {
            count = 1;
            for (int i = 0; i < str.length(); i++) {
                if (i + 1 != str.length()) {
                    if (str.charAt(i) == str.charAt(i + 1)) {
                        count++;
                    } else {
                        sb.append(count).append(str.charAt(i));
                        count = 1;
                    }
                } else {
                    sb.append(count).append(str.charAt(i));
                }
            }
            str = sb.toString();
            sb.setLength(0);
            A--;
        }

        return str;
    }
}
