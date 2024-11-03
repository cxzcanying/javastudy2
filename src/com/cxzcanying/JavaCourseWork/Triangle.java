package com.cxzcanying.JavaCourseWork;

public class Triangle {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        a=0.0;
        b=0.0;
        c=0.0;

    }
    public double area(double a,double b,double c){
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
