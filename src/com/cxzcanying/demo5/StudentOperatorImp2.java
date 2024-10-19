package com.cxzcanying.demo5;

import java.util.ArrayList;

public class StudentOperatorImp2 implements StudentOperator {
    @Override
    public void printInfo(ArrayList<Student> students) {
        System.out.println("---------全部学生信息如下-----------");
        int maleCount=0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("姓名: " + s.getName() + " 性别: " + s.getSex() + " 分数: " + s.getScore());
            if(s.getSex()=="男"){
            maleCount++;
            }
        }
        System.out.println("男生数量: "+maleCount+" 女生数量: "+(students.size()-maleCount));
        System.out.println("班级总人数: "+students.size());
        System.out.println("---------------------------------");
    }

    @Override
    public void printScore(ArrayList<Student> students) {
        double allScore=0.0;
        double max=students.get(0).getScore();
        double min=students.get(0).getScore();
        for (int i = 0; i < students.size(); i++) {
            Student s=students.get(i);
            if(students.get(i).getScore()>max){
                max=students.get(i).getScore();
            }
            else if(students.get(i).getScore()<min){
                min=students.get(i).getScore();
            }
            allScore+=s.getScore();
        }
        System.out.println("最高分: "+max+" 最低分: "+min);
        System.out.println("平均分："+(allScore-max-min)/(students.size()-2));
    }
}
