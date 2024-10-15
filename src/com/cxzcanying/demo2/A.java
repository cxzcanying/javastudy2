package com.cxzcanying.demo2;

public class A {
    //单例设计模式
    //1.必须私有化构造器
    private A(){

    }

    //2.定义一个类变量记住类的一个对象
    private static A a=new A();

    //3.定义一个类方法返回一个类的对象
    public static A getInstance(){
        return a;
    }
}
