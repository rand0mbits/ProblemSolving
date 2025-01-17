package me.schuman.java_bigdecimal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Solution for the HackerRank problem "Java BigDecimal".
 * The task involves sorting an array of numeric strings based on their BigDecimal values in descending order,
 * with ties resolved by their original order in the input array.
 *
 * Problem Link: https://www.hackerrank.com/challenges/java-bigdecimal/problem?isFullScreen=true
 */
public class Solution {
    /**
     * @param s the array of numeric strings to sort
     */
    public static void sort(String[] s) {
        // Local class to represent an item for sorting purposes
        class Item implements Comparable<Item> {
            BigDecimal bigDecimal;
            String string; // Original string value
            int originalIndex;

            Item(String string, int originalIndex) {
                this.string = string;
                this.originalIndex = originalIndex;
                this.bigDecimal = new BigDecimal(string);
            }

            @Override
            public int compareTo(Item other) {
                // Descending comparison
                int bdCompare = -this.bigDecimal.compareTo(other.bigDecimal);
                if (bdCompare != 0) {
                    return bdCompare;
                } else {
                    // Input order
                    return Integer.valueOf(this.originalIndex).compareTo(other.originalIndex);
                }
            }
        }
        // Create a list of Item objects for sorting
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            // Skip null values (possible in input)
            if (s[i] == null) continue;
            items.add(new Item(s[i], i));
        }
        // Sort using our custom compareTo
        items.sort(null);
        // Map the sorted items back to the original string array
        s = items.stream().map(item -> item.string).toArray(String[]::new);
    }
}
