package me.schuman.java_anagrams;

import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static boolean isAnagram(String a, String b) {
        // Convert both input strings to uppercase and store them in an array for easier processing
        String[] strings = {a.toUpperCase(), b.toUpperCase()};
        // Arrays to store frequency counts of letters (A-Z) for each string
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        // Group the frequency arrays together for simpler iteration
        int[][] freq = {freq1, freq2};
        // Loop over both strings to calculate the frequency of each character
        for (int stringNum = 0; stringNum < strings.length; stringNum++) {
            for (int i = 0; i < strings[stringNum].length(); i++) {
                // Increment the count of the character in the respective frequency array
                freq[stringNum][strings[stringNum].charAt(i) - 'A']++;
            }
        }

        // Compare the frequency counts of letters between the two strings
        // return false if there's a mismatch, otherwise return true
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) return false;
        }

        return true;
    }

    /**
     * Additional solution using HashMaps
     */
    static boolean isAnagramHashMap(String a, String b) {
        Map<Character, Long> frequencyMapA = a.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c,
                        Collectors.counting()));
        Map<Character, Long> frequencyMapB = b.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c,
                        Collectors.counting()));

        return frequencyMapA.equals(frequencyMapB);
    }

}
