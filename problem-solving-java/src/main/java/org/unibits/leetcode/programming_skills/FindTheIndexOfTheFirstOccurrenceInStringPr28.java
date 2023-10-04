package org.unibits.leetcode.programming_skills;

public class FindTheIndexOfTheFirstOccurrenceInStringPr28 {

    // old try1
    public int strStrSol1(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (
                    haystack.charAt(i) == needle.charAt(0)
                    && haystack.substring(i).length() >= needle.length()
                    && haystack.substring(i, i + needle.length()).equals(needle)
            ) {
                return i;
            }
        }
        return -1;
    }

    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (isSubStr(haystack, needle, i)) {
                return i;
            }
        }
        return -1;
    }

    private boolean isSubStr(String str1, String str2, int startIndex) {
        if (startIndex > str1.length() - str2.length()) {
            return false;
        }

        int str2Pointer = 0;
        if (str1.charAt(startIndex) == str2.charAt(0)) {
            while (str2Pointer < str2.length()) {
                if (str1.charAt(startIndex++) != str2.charAt(str2Pointer++)) {
                    return false;
                }
            }
        } else {
            return false;
        }

        return true;
    }

}
