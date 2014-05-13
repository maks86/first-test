/*Написать класс-калькулятор, производящий суммирование, вычитание, умножение и деление денежных сумм.
Объект класса Калькулятор имеет состояние – текущее значение, над которым выполняются арифметические операции
Денежные суммы могут передаваться как в виде числовых параметров, так и в виде строк в формате xxx.xxx,dd.
Класс должен возвращать результат как в числовом виде, так и в строковом в вышеуказанном формате.
Написать тестирующий класс, проверяющий корректность работы класса (10.000,25)*/
package com.calculator;
import java.text.NumberFormat;
import java.util.Locale;

public class Calculator {
    double result;

    public Calculator(double result) {
        this.result = result;
    }
    public Calculator(String str){
        result=Double.valueOf(str.replace(".","").replace(",","."));
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
        if (b==0){
            throw new IllegalArgumentException("division by zero!");
        }
        result/=b;
        return result;
    }
    public String toString(double result){
            NumberFormat format = NumberFormat.getInstance(Locale.UK);
            format.setMaximumFractionDigits(1);
            System.out.println(format.format(result));
            return format.format(result);
        }
      //  А здесь нужно приводить к строке текущее значение result
}