package com.max;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TestCalculator {
    @Test
    public void testGetSum(){
        Calculator calculator = new Calculator(1.5);
        double result= calculator.sum(0.5);
        assertEquals(2.0,result,0.01);
    }
    @Test
    public void testGetSubtraction() {
        Calculator calculator = new Calculator(1.5);
        double result= calculator.subtraction(0.5);
        assertEquals(1.0,result,0.01);
    }
    @Test
    public void testGetMultiplication() {
        Calculator calculator = new Calculator(1.5);
        double result= calculator.multiplication(0.5);
        assertEquals(0.75,result,0.01);
    }
    @Test
    public void testGetDivision() {
        Calculator calculator = new Calculator(1.5);
        double result=calculator.division(0.5);
        assertEquals(3.0,result,0.01);
    }
}