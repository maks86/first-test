/*Написать класс-калькулятор, производящий суммирование, вычитание, умножение и деление денежных сумм.
Объект класса Калькулятор имеет состояние – текущее значение, над которым выполняются арифметические операции
Денежные суммы могут передаваться как в виде числовых параметров, так и в виде строк в формате xxx.xxx,dd.
Класс должен возвращать результат как в числовом виде, так и в строковом в вышеуказанном формате.
Написать тестирующий класс, проверяющий корректность работы класса*/
package com.calculate;
public class Calculate {
    double res;
    double result;
    String punctuation = ",";
    String first;

    public Calculate(double result) {
        this.result = result;
    }
    public Calculate(String str){
        if (str.indexOf(punctuation) != -1) {  //found s в source;
            System.out.println("Given the number of non-standard format ! ");
            // Determine the position of the character ','
            int p1 = str.indexOf(',');
            // Cut the first word
            first = str.substring(0, p1);
            // Cut the second word
            String second = str.substring(p1);
            // sew
            String assemblyLine = first + second;
            System.out.println("assemblyLine=" + assemblyLine);
            //converts a string to number
            res = Double.parseDouble(first);
            result=res;
            System.out.println("result="+(result));
        } else {
            System.out.println("Given the number of standard format ! ");
        }
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
    public  double getResult(){
        return result;
    }
}

