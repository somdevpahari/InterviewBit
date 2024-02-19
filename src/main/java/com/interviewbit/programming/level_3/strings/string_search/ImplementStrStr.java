package com.interviewbit.programming.level_3.strings.string_search;
/*
https://www.interviewbit.com/problems/implement-strstr/

Medium, Asked in Facebook, Microsoft, and Amazon

Another question which belongs to the category of questions which are intentionally stated vaguely.

Expectation is that you will ask for correct clarification or you will state your assumptions before you start coding.

Problem Description

Another question which belongs to the category of questions which are intentionally stated vaguely.

Expectation is that you will ask for correct clarification or you will state your assumptions before you start coding.

Implement strStr().

strstr - locate a substring ( needle ) in a string ( haystack ).

Try not to use standard library string functions for this question.

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

NOTE: String A is haystack, B is needle.

Good clarification questions:

What should be the return value if the needle is empty?
What if both haystack and needle are empty?
For the purpose of this problem, assume that the return value should be -1 in both cases.

Problem Constraints
1 <= |haystack| <= 104
1 <= |needle| <= 103

Input Format
The first argument is a string A (haystack)
The second argument is a string B (needle)

Output Format
Return an integer, the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example Input
Input 1:
A = "strstr"
B = "str"
Input 2:
A = "bighit"
B = "bit"

Example Output
Output 1:
0
Output 1:
-1

Example Explanation
Explanation 1:
"str" occurs at index 0 and 3.
The first occurrence is at index 0, so we return 0.
Explanation 2:
"bit" did not occur in "bighit", so we return -1.
 */
public class ImplementStrStr {
    public int strStr(final String haystack, final String needle) {
        int txtLen = haystack.length();
        int patLen = needle.length();
        int flag = 0;

        if (txtLen < patLen) {
            return -1;
        }

        if (patLen == 0) {
            return 0;
        }

        int[] pre = new int[patLen];

        preComp(needle, pre);
        int i = 0; // for hay
        int j = 0; // for needle

        while (i < txtLen) {
            if (j == -1) {
                i++;
                j = 0;
            } else if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if (j == patLen) {
                    flag = 1;
                    break;
                }
            } else {
                j = pre[j];
            }
            if (flag == 1) {
                break;
            }
        }

        if (flag == 1) {
            return i - j;
        }

        return -1;
    }

    private void preComp(final String A, int[] vec) {
        int len = A.length();
        vec[0] = -1;
        int k;
        for (int i = 1; i < A.length(); i++) {
            k = vec[i - 1];
            while (k >= 0) {
                if (A.charAt(k) == A.charAt(i - 1)) {
                    break;
                } else {
                    k = vec[k];
                }
            }
            vec[i] = k + 1;
        }
    }
}
