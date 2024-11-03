package com.cxzcanying.JavaCourseWork;

import java.util.ArrayList;

public class demo4 {
    public static void main(String[] args) {
        ArrayList<Integer> primes = sieveOfEratosthenes(100);
        System.out.println("素数列表：");
        for (int prime : primes) {
            System.out.println(prime);
        }
    }
    public static ArrayList<Integer> sieveOfEratosthenes(int max) {
        boolean[] isPrime = new boolean[max + 1];
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i < max + 1; i++) {
            isPrime[i] = true;
        }
        for (int factor = 2; factor * factor <= max; factor++) {
            if (isPrime[factor]) {
                for (int multiple = factor * factor; multiple <= max; multiple += factor) {
                    isPrime[multiple] = false;
                }
            }
        }
        for (int i = 2; i < max + 1; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}