package com.cxzcanying.demo8;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1=new Student("张三",20);
        System.out.println(s1);

        //toString可省略
        System.out.println(s1.toString());

        Student s2=new Student("李四",17);
        System.out.println(s2.equals(s1));
        Student s3 = (Student) s1.clone();
        System.out.println(s3.name);
    }
}
//浅克隆和深克隆
//浅克隆拷贝地址，不新建新对象
//深克隆基本数据类型和String拷贝地址，其他类型创建新对象