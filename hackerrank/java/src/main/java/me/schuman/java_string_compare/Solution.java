package me.schuman.java_string_compare;

/**
 * Given a string, s, and an integer, k, complete the function
 * so that it finds the lexicographically smallest and largest
 * substrings of length k.
 *
 * Source: https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
 */
public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        // set smallest and largest to the first possible substring
        String smallest = s.substring(0, k);
        String largest = smallest;

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        /*
         * Uses a sliding window to extract all substrings of length 'k' from the string 's'.
         * For each substring, it updates 'smallest' if the substring is lexicographically smaller,
         * and updates 'largest' if it is lexicographically larger.
         */
        for (int i = 0; (i+k-1) < s.length(); i++) {
            String word = s.substring(i, i+k);
            if (word.compareTo(smallest) < 0) smallest = word;
            else if (word.compareTo(largest) > 0) largest = word;
        }
        return smallest + "\n" + largest;
    }
}
