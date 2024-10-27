package com.cxzcanying.JavaWork2;

public class MyZoo {
    public static void main(String[] args) {
        System.out.println("欢迎来到动物园，你将遇到很多动物");
        Action action1 =new Bear();
        action1.cry();


        Action action2 =new Fish();
        action2.cry();


        action1 =new Panda();
        action1.cry();
        action1.sleep();

        Action action3=new Bird();
        action3.sleep();
        action3=new Dog();
        action3.cry();

    }
}
