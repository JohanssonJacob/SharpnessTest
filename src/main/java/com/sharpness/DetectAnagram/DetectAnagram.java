package com.sharpness.DetectAnagram;

import java.util.Arrays;

public class DetectAnagram {

    public boolean detectAnagram(String string1, String string2) {
        if (string1.length() == string2.length()) {
            char[] stringArr1 = string1.toLowerCase().toCharArray();
            char[] stringArr2 = string2.toLowerCase().toCharArray();
            Arrays.sort(stringArr1);
            Arrays.sort(stringArr2);
            return Arrays.toString(stringArr1).equalsIgnoreCase(Arrays.toString(stringArr2));
        }
        return false;
    }
}
