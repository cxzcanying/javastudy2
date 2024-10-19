package com.cxzcanying.JavaWork1;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        int n1 = 0;
        for (int i = 0; i < 101; i++) {
            n1 += i;
        }
        System.out.println("1加到100:" + n1);
        n1 = 0;
        System.out.println("-------------");


        Scanner sc = new Scanner(System.in);
        System.out.println("a=");
        double a = sc.nextDouble();
        System.out.println("b=");
        double b = sc.nextDouble();
        Double c = 0.0;
        System.out.println("1.+");
        System.out.println("2.-");
        System.out.println("3.*");
        System.out.println("4./");
        int operator = sc.nextInt();
        switch (operator) {
            case 1: {
                c = a + b;
                System.out.println(a + "+" + b + "=" + c);
                break;
            }
            case 2: {
                c = a - b;
                System.out.println(a + "-" + b + "=" + c);
                break;
            }
            case 3: {
                c = a * b;
                System.out.println(a + "x" + b + "=" + c);
                break;
            }
            case 4: {
                if (b == 0) {
                    System.out.println("除数不能为0");
                    break;
                } else {
                    c = a / b;
                    System.out.println(a + "/" + b + "=" + c);
                    break;
                }
            }
        }
        System.out.println("--------------");

        System.out.println("输入一个数");
        int n2 = sc.nextInt();
        boolean i = false;
        for (int j = 1; j < n2; j++) {
            if (n2 % j == 0) {
                i = true;
            } else {
                i = false;
            }
        }
        if (i == true) {
            System.out.println(n2 + "是素数");
        } else {
            System.out.println(n2 + "不是素数");
            System.out.println("---------------");
        }
    }
}
