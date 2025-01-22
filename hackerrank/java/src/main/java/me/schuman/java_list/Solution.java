package me.schuman.java_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
 */
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int initNum = sc.nextInt();
        for (int i = 0; i < initNum; i++) {
            list.add(sc.nextInt());
        }
        int numQueries = sc.nextInt();
        for (int i = 0; i < numQueries; i++) {
            sc.nextLine(); // clear new line
            String query = sc.nextLine();
            if (query.equals("Insert")) {
                int idx = sc.nextInt();
                int num = sc.nextInt();
                list.add(idx, num);
            } else if (query.equals("Delete")) {
                int idx = sc.nextInt();
                list.remove(idx);
            }
        }

        sc.close();

        list.forEach(num -> System.out.print(num + " "));
    }
}
