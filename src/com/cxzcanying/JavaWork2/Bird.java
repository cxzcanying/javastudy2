package com.cxzcanying.JavaWork2;

public class Bird extends Animal implements Action {
    @Override
    public void cry() {
        System.out.println("鸟叫---");
    }

    @Override
    public void sleep() {
        System.out.println("鸟在睡觉---");
    }
}
