package com.cxzcanying.demo8;

import java.util.ArrayList;
import java.util.Objects;

public class Test2 {
    //Objects
    public static void main(String[] args) {
        String s1=null;
        String s2="alsdkjl";
        //Objects


        //System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(Objects.equals(s1, s2));
        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.nonNull(s2));

        //包装类
        ArrayList<Integer> list=new ArrayList<>();
        //自动装箱
        Integer a1=23;
        //自动拆箱
        int a2=a1;
    }
}
