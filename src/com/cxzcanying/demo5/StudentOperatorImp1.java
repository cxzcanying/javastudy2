package com.cxzcanying.demo5;

import java.util.ArrayList;

public class StudentOperatorImp1 implements StudentOperator {
    @Override
    public void printInfo(ArrayList<Student> students) {
        System.out.println("---------全部学生信息如下-----------");
        for (int i = 0; i < students.size(); i++) {
            Student s=students.get(i);
            System.out.println("姓名: "+s.getName()+" 性别: "+s.getSex()+" 分数: "+s.getScore());
        }
        System.out.println("---------------------------------");
    }

    @Override
    public void printScore(ArrayList<Student> students) {
    double allScore=0.0;
        for (int i = 0; i < students.size(); i++) {
            Student s=students.get(i);
            allScore+=s.getScore();
        }
        System.out.println("平均分："+(allScore)/ students.size());
    }
}
