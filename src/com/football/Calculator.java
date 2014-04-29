package com.football;

public class Calculator {
    double a;
    double memory;

    public Calculator(double a) {
        this.a = a;
        memory=a;
    }


    public double sum(double b) {
        memory+=b;
        return memory;
    }
    public double subtraction(double b) {
        memory-=b;
        return memory;
    }


    public double multiplication(double b) {
        memory*=b;
        return memory;
    }

    public double division(double b) {
        if (b==0){
            System.out.println("Деление на ноль не возможно!");
        }else
        memory/=b;
        return memory;
    }
}
