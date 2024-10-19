package com.cxzcanying.demo4;

public class Test {
    public static void main(String[] args) {
        People p1 = new Teacher();
        p1.run();//编译看左边，运行看右边(行为多态)
        System.out.println(p1.name);//编译和运行都看左边(成员变量不谈多态)

        People p2 = new Student();
        p2.run();//编译看左边，运行看右边(行为多态)
        System.out.println(p2.name);//编译和运行都看左边(成员变量不谈多态)

    }
}
