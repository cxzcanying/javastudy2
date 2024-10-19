package com.cxzcanying.demo4;

public class Teacher extends People{
    public String name="子类Teacher";
    @Override
    public void run(){
        System.out.println("Teacher run");
    }
    public void teach(){
        System.out.println("Teacher teach");
    }
}

