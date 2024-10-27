package com.cxzcanying.JavaWork2;

public class Bear extends Animal implements Action {
    @Override
    public final void cry() {
        System.out.println("熊叫---");
    }

    @Override
    public void sleep() {
        System.out.println("熊在睡觉---");
    }
}
