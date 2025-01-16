package me.schuman.java_string_reverse;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        /*
         * Checks if the string `A` is a palindrome.
         * Compares characters from the start and end, moving toward the middle.
         */
        for (int i = 0; i <= (A.length() / 2); i++) {
            if (A.charAt(i) != A.charAt(A.length() - i - 1)) {
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
    }
}
