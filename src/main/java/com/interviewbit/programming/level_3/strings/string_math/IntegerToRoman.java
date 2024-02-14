package com.interviewbit.programming.level_3.strings.string_math;

public class IntegerToRoman {
    public String intToRoman(int A) {
        // for thousands
        String[] m = {"", "M", "MM", "MMM"};

        // for hundreds
        String[] c = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

        // for tens
        String[] x = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

        // for ones
        String[] i = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String thou = m[A / 1000];
        String hund = c[(A % 1000) / 100];
        String tens = x[(A % 100) / 10];
        String ones = i[A % 10];

        String iToR = thou + hund + tens + ones;

        return iToR;
    }
}
