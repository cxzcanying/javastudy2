package com.cxzcanying.JavaWork2;

import com.sun.security.jgss.GSSUtil;

public class Panda extends Animal implements Action {
    @Override
    public void cry() {
        System.out.println("熊猫叫--");
    }

    @Override
    public void sleep() {
        System.out.println("很不幸运。，熊猫不想见人---");
    }
}
