package me.schuman.java_string_tokens;

import java.util.Arrays;

public class Solution {
    public static void split(String s) {
        // If the input string is empty, print 0 and exit the method early
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }
        // Split the string into tokens based on multiple delimiters (spaces, punctuation, etc.)
        // Use a regular expression to match one or more of the specified delimiters ([ \!\\,\\?\\._'@]+)
        String[] tokens = Arrays.stream(s.split("[ \\!\\,\\?\\._'@]+"))
                // Filter out any empty tokens that may result from consecutive delimiters
                .filter(token -> !token.isEmpty())
                // Collect the filtered tokens into a String array
                .toArray(String[]::new);
        // Print the number of resulting tokens and each token on a new line
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
