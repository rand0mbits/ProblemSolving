package me.schuman.java_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true
 */
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            int d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                row.add(sc.nextInt());
            }
            nums.add(row);
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            if (row < 1 || row > nums.size() || col < 1 || col > nums.get(row-1).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(nums.get(row-1).get(col-1));
            }
        }

        sc.close();
    }
}
