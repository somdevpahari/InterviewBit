package com.interviewbit.programming.level_3.strings.string_parsing;
/*
https://www.interviewbit.com/problems/compare-version-numbers/

Problem Description

Compare two version numbers version1 and version2.
If version1 > version2 return 1,
If version1 < version2 return -1,
otherwise return 0.
You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences. For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Note: Here is an example of version numbers ordering:
0.1 < 1.1 < 1.2 < 1.13 < 1.13.4

Problem Constraints
1 <= |A|, |B| <= 5000

Input Format
The first argument is a string A representing version1.
The first argument is a string B representing version2.

Output Format
Return an integer.

Example Input
A = "1.13"
B = "1.13.4"

Example Output
-1

Example Explanation
Version1 = "1.13"
Version2 = "1.13.4"
Version1 < version2, hence return -1

 */

/**
 * @author Somdev Pahari
 */
public class CompareVersionNumbers {
    public String extract(int[] i, String str) {
        if (i[0] >= str.length()) {
            return "0";
        }
        int temp = i[0];
        StringBuilder sb = new StringBuilder();
        while (temp < str.length() && str.charAt(temp) != '.') {
            sb.append(str.charAt(temp));
            temp++;
        }
        i[0] = temp + 1;
        return sb.toString();
    }

    public String rem(String a) {
        int i = 0;
        while (i < a.length() && a.charAt(i) == '0') {
            i++;
        }
        return a.substring(i);
    }

    public int compareStr(String a, String b, int[] first) {
        String A = rem(a);
        String B = rem(b);

        if (A.length() > B.length()) {
            return 1;
        } else if (A.length() < B.length()) {
            return -1;
        } else {
            for (int i = 0; i < A.length(); i++) {
                int numa = A.charAt(i);
                int numb = B.charAt(i);
                if (numa > numb) {
                    return 1;
                } else if (numa < numb) {
                    return -1;
                }
            }
        }
        return 0;
    }

    /**
     *
     * @param A
     * @param B
     * @return
     */
    public int compareVersion(String A, String B) {
        int[] i = {0};
        int[] j = {0};
        int[] first = {1};

        while (i[0] < A.length() || j[0] < B.length()) {
            String numa = extract(i, A);
            String numb = extract(j, B);
            int comparison = compareStr(numa, numb, first);
            if (comparison == 1) {
                return 1;
            } else if (comparison == -1) {
                return -1;
            }
            first[0] = 0;
        }
        return 0;
    }
}
