package com.interviewbit.programming.level_3.strings.string_math;

public class AddBinaryStrings {
    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(char[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public String addBinary(String A, String B) {
        int i = A.length() - 1;
        int j = B.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0) {
            int a = (i >= 0) ? Character.getNumericValue(A.charAt(i)) : 0;
            int b = (j >= 0) ? Character.getNumericValue(B.charAt(j)) : 0;

            int sum = a + b + carry;
            result.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        if (carry == 1) {
            result.append('1');
        }

        return result.reverse().toString();
    }
}
