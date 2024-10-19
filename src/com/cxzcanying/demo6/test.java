package com.cxzcanying.demo6;

public class test {
    public static void main(String[] args) {
//        Animal a=new cat();
//        a.cry();
        Animal a=new Animal(){
            @Override
            public void cry() {
                System.out.println("cat cry");
            }
        };
        a.cry();
    }
}


abstract class Animal{
    public abstract void cry();
}

//class cat extends Animal{
//    @Override
//    public void cry() {
//        System.out.println("cat cry");
//    }
//}
