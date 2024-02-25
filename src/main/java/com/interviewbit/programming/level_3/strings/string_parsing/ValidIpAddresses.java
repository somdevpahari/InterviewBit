package com.interviewbit.programming.level_3.strings.string_parsing;

import java.util.ArrayList;
import java.util.List;

public class ValidIpAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        if (s.length() > 12 || s.length() < 4)
            return ans;

        for (int i = 1; i < 4; i++) {
            String first = s.substring(0, i);
            if (!isValid(first))
                continue;
            for (int j = 1; i + j < s.length() && j < 4; j++) {
                String second = s.substring(i, i + j);
                if (!isValid(second))
                    continue;
                for (int k = 1; i + j + k < s.length() && k < 4; k++) {
                    String third = s.substring(i + j, i + j + k);
                    String fourth = s.substring(i + j + k);
                    if (isValid(third) && isValid(fourth)) {
                        String current = first + "." + second + "." + third + "." + fourth;
                        ans.add(current);
                    }
                }
            }
        }
        return ans;
    }

    private boolean isValid(String s) {
        if (s.length() > 1 && s.charAt(0) == '0')
            return false;
        int num = Integer.parseInt(s);
        return num <= 255 && num >= 0;
    }
}
