package com.calculate;
public class Calculate {
    double result;

    public Calculate(double result) {
        this.result = result;
    }

    public double add(double b) {
        result+=b;
        return result;
    }
    public double subtract(double b) {
        result-=b;
        return result;
    }


    public double multiply(double b) {
        result*=b;
        return result;
    }

    public double divide(double b) {
     if (b==0)
         throw new IllegalArgumentException("division by zero!");
            result/=b;
         return result;
  }
}

