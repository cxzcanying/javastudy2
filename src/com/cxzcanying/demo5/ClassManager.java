package com.cxzcanying.demo5;

import java.util.ArrayList;

public class ClassManager {
    private ArrayList<Student> students=new ArrayList<>();
    private StudentOperator studentOperator=new StudentOperatorImp2();
    public ClassManager() {
        students.add(new Student("张三", "男", 99));
        students.add(new Student("李四", "女", 50));
        students.add(new Student("王五", "女", 30));
        students.add(new Student("赵六", "男", 68));
    }
        //打印全班全部学生的信息
        public void printInfo(){
        studentOperator.printInfo(students);
        }
        //打印全班全部学生的平均分
        public void printScore(){
        studentOperator.printScore(students);
        }
    }

