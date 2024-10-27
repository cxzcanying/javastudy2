package com.cxzcanying.JavaWork2;

public class Fish extends Animal implements Action {
    @Override
    public void cry() {
        System.out.println("我是鱼---");
    }

    @Override
    public void sleep() {
        System.out.println("鱼不见了---");
    }
}
