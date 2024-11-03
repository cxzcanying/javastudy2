package com.cxzcanying.JavaCourseWork;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入a数组的长度");
        int[] a=new int[sc.nextInt()];
        System.out.println("请输入a数组的值");
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.nextInt();
        }

        System.out.println("请输入b数组的长度");
        int[] b=new int[sc.nextInt()];
        System.out.println("请输入b数组的值");
        for (int i = 0; i < b.length; i++) {
            b[i]= sc.nextInt();
        }

        //sumArray(int[] a,int[] b);
        System.out.print("数组a为{");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("}");
        System.out.print("数组b为{");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println("}");
        int[] resultArray = sumArray(a, b);


        System.out.print("求和后数组为: [");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]);
            if (i < resultArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
    public static int[] sumArray(int[] a, int[] b) {
        int length = Math.max(a.length, b.length);
        int[] result = new int[length];


        for (int i = 0; i < length; i++) {
            int sum = 0;
            if (i < a.length) {
                sum += a[i];
            }
            if (i < b.length) {
                sum += b[i];
            }
            result[i] = sum;
        }

        return result;
    }
}
