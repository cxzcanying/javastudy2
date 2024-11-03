package com.cxzcanying.JavaCourseWork;

import static java.lang.Math.min;

public class B extends A {
    public static int lcm(Integer a, Integer b) {
        int d = 0;
        try {
            if (a <=0 || b <= 0) {
                System.out.println("a或b的值须为正整数");
            } else {
                d=a * b/ gcd(a, b) ;

            }
        } catch (Exception e) {
            System.out.println("请输入正整数");
        }

        return d;
    }
}


