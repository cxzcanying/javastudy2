package com.cxzcanying.JavaCourseWork;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入a的值：");
        double a=sc.nextDouble();
        System.out.println("请输入b的值：");
        double b=sc.nextDouble();
        System.out.println("请输入c的值：");
        double c=sc.nextDouble();
        if(a+b>c||a+c>b||b+c>a){
            Triangle tri=new Triangle(a,b,c);
            System.out.println("三角形面积为:"+tri.area(a, b, c));
        }else {
            System.out.println("你输入的三角形不存在");
        }

    }
}
