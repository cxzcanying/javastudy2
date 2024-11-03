package com.cxzcanying.JavaCourseWork;

import static  java.lang.Math.min;

public class A {
   public static int gcd(Integer a,Integer b){
       int c=0;
   if (a <=0 || b <= 0){
       System.out.println("a或b的值须为正整数");
   }
   else
   {
       for (int i = 2; i <= min(a,b); i++) {
           if(b%i==0){
               c=b;
           }
       }
       if(c==0){
           c=1;
       }
   }

       return c;
   }
}

