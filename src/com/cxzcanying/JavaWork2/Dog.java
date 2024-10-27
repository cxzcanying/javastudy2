package com.cxzcanying.JavaWork2;

public class Dog extends Animal implements Action {
    @Override
    public void cry() {
        System.out.println("狗叫---");
    }

    @Override
    public void sleep() {
        System.out.println("狗在睡觉---");
    }
}
