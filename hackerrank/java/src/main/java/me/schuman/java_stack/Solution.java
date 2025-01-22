package me.schuman.java_stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=true
 */
public class Solution {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            Boolean isBalanced = true;
            Stack<Character> stack = new Stack<>();
            for (char ch : input.toCharArray()) {
                if (ch == '}') {
                    if (stack.isEmpty() || stack.peek() != '{') {
                        isBalanced = false;
                        break;
                    }
                    stack.pop();
                } else if (ch == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isBalanced = false;
                        break;
                    }
                    stack.pop();
                } else if (ch == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        isBalanced = false;
                        break;
                    }
                    stack.pop();
                } else if (ch == '{' || ch == '(' || ch == '[') {
                    stack.add(ch);
                }
            }

            if (!stack.isEmpty()) isBalanced = false;

            System.out.println(isBalanced);
        }
    }
}
