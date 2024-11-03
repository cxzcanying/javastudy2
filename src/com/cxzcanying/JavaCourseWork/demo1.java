package com.cxzcanying.JavaCourseWork;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入a的值");
            Integer a=sc.nextInt();
            System.out.println("请输入b的值");
            Integer b=sc.nextInt();


            //gcd方法
            System.out.println("最大公约数:"+A.gcd(a, b));

            //lcm方法
            System.out.println("最小公倍数:"+B.lcm(a, b));
        }

    }
}
