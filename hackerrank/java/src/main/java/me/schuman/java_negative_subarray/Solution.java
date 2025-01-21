package me.schuman.java_negative_subarray;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Counter for subarrays with a negative sum
        int negCount = 0;
        // Iterate through all possible subarrays, where `i` is the start of the subarray
        // and `j` is the end of the subarray
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Calculate the sum of the current subarray
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum < 0) {
                    negCount++;
                }
            }
        }
        System.out.println(negCount);
    }
}
