package com.interviewbit.programming.level_3.strings.string_math;

public class PowerOfTwo {
    public String multiplyByTwo(String A) {
        StringBuilder ans = new StringBuilder();
        int sum = 0, carry = 0;
        for (int i = A.length() - 1; i >= 0; i--) {
            sum = (A.charAt(i) - '0') * 2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.append((char) (sum + '0'));
        }
        if (carry > 0) {
            ans.append((char) (carry + '0'));
        }
        ans.reverse();
        return ans.toString();
    }

    public boolean compareString(String temp, String num) {
        if (temp.length() == num.length()) {
            return temp.compareTo(num) < 0;
        } else if (temp.length() < num.length()) {
            return true;
        }
        return false;
    }

    public int power(String A) {
        int i = 0;
        int length = A.length();
        while (i < length && A.charAt(i) == '0') {
            i++;
        }
        if (i == length) {
            return 0;
        }

        String num = A.substring(i);

        String temp = "2";
        while (compareString(temp, num)) {
            temp = multiplyByTwo(temp);
        }

        if (temp.equals(num)) {
            return 1;
        }

        return 0;
    }
}
