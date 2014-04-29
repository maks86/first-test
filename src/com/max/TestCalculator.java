package com.max;
import com.football.*;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator example=new Calculator(5.5);
        System.out.println(example.sum(0.5));
        System.out.println(example.division(0));
    }
}
