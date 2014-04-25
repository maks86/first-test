package com.football;

public class Calculator {
    double a;

    public Calculator(double a) {
        this.a = a;
    }


    public double sum(double b) {
        return a+b;
    }


    public double subtraction(double b) {
        return a-b;
    }


    public double multiplication(double b) {
        return a*b;
    }

    public double division(double b) {
        return a/b;
    }

}