package com.cxzcanying.demo4;

public class Test2 {
    public static void main(String[] args) {
        People p1 = new Student();//自动类型转换
        p1.run();
        //p1.test();

        //强制类型转换
        Student s1 = (Student) p1;
        s1.test();

        //Teacher t1= (Teacher) p1;//运行时出现ClassCastException(类型转换异常)

//        if (p1 instanceof Student) {
//            Student s2 = (Student) p1;
//            s2.test();
//        } else {
//            Teacher t2 = (Teacher) p1;
//            t2.teach();
//        }
        //此代码为面对无法确定变量类型时可用，一般不用，如下的go方法

        System.out.println("-----------------------");

        Student/*people*/ s = new Student();
        go(s);
        Teacher/*people*/ t = new Teacher();
        go(t);
    }


    public static void go(People p){
        p.run();
        if (p instanceof Student) {
            Student s = (Student) p;
            s.test();
        } else if (p instanceof Teacher) {
            Teacher t = (Teacher) p;
            t.teach();
        }
    }
}
