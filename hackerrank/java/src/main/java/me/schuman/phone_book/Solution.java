package me.schuman.phone_book;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true
 */
public class Solution {
    public static void main(String []argh)
    {
        Map<String, Integer> phonebook = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            phonebook.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (phonebook.containsKey(s)) {
                System.out.println(String.format("%s=%d", s, phonebook.get(s)));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
