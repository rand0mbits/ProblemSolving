package me.schuman.java_primality_test;

import java.math.BigInteger;

/**
 * https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true
 */
public class Solution {
    public static void isPrime(String n) {
        BigInteger bi = new BigInteger(n);
        if (bi.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
