package org.unibits.leetcode.programming_skills;

public class MergeStringsAlternatelyPr1768 {

    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int maxLength = Math.max(m, n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxLength; i++) {
            if (i < m) {
                result.append(word1.charAt(i));
            }
            if (i < n) {
                result.append(word2.charAt(i));
            }
        }

        return result.toString();
    }

}
