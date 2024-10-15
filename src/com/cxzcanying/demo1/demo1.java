package com.cxzcanying.demo1;

public class demo1 {
    public static void main(String[] args) {
        //静态代码块只执行一次
        System.out.println(Student.number);
        System.out.println(Student.number);
        System.out.println(Student.number);
        System.out.println("------------------");

        Student s1 = new Student();
        Student s2 = new Student("李华");
    }
}
