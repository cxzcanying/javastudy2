package com.cxzcanying.demo4;

public class Student extends People{
    public String name="子类Student";
    @Override
    public void run(){
        System.out.println("Student run");
    }
    public void test(){
        System.out.println("Student test");
    }
}

