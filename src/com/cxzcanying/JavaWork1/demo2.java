package com.cxzcanying.JavaWork1;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 100 || a < 0) {
            System.out.println("输入非法");
        } else if (a > 0 && a <= 60) {
            System.out.println("F");
        } else if (a > 60 && a <= 70) {
            System.out.println("D");
        } else if (a > 70 && a <= 80) {
            System.out.println("C");
        } else if (a > 80 && a <= 90) {
            System.out.println("B");
        } else if (a > 90 && a <= 100) {
            System.out.println("A");
        }
        System.out.println("------------");

        int b = 2;
        int sum = 0;
        while (b < 100) {
            sum += b;
            b+=2;
        }
        System.out.println("100以内所有偶数的和" + sum);
        System.out.println("-------------");


        for (int i = 1; i <=9; i++) {
            for (int j = 1;j <=i; j++) {
                System.out.print(i+"x"+j+"="+(i*j)+" ");
            }
                System.out.println();
        }
    }
}
