package org.unibits.leetcode.programming_skills;

public class FindTheDifferencePr389 {

    public char findTheDifference(String s, String t) {
        int charsDiff = t.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            charsDiff += t.charAt(i+1) - s.charAt(i);
        }
        return (char) charsDiff;
    }

    public char findTheDifferenceExtraSol1(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : t.toCharArray()) c ^= ct;
        return c;
    }

}
