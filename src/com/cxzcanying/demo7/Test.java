package com.cxzcanying.demo7;

public class Test {
    public static void main(String[] args) {
    cal(A.A);
    }
    public static void cal(A operator){
        switch(operator){
            case A:
                System.out.println("+");
                break;
            case B:
                System.out.println("-");
                break;
            case C:
                System.out.println("*");
                break;
            case D:
                System.out.println("/");
                break;
        }
    }
}
