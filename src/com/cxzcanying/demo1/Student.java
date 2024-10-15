package com.cxzcanying.demo1;

public class Student {
    static int number=80;
    //静态代码块
    static {
        System.out.println("静态代码块执行了");
    }//对类变量赋初始值

    //实例代码块
    {
        System.out.println("实例代码块执行了");
    }//和构造器一样，对对象初始化，在构造器前执行，可用于减少构造器日志的语句复用


    public Student() {
        System.out.println("无参构造器执行了");
    }
    public Student(String name) {
        System.out.println("有参构造器执行了");
    }
}
