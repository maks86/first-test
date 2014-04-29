/*Написать класс-калькулятор, производящий суммирование, вычитание, умножение и деление денежных сумм.
Объект класса Калькулятор имеет состояние – текущее значение, над которым выполняются арифметические операции
Денежные суммы могут передаваться как в виде числовых параметров, так и в виде строк в формате xxx.xxx,dd.
Класс должен возвращать результат как в числовом виде, так и в строковом в вышеуказанном формате.
Написать тестирующий класс, проверяющий корректность работы класса*/
package com.football;
public class Main {
    public static void main(String[] args) {

        //present value
        String source = "5.5,dd";
        String punctuation = ",";
        String first;
        if (source.indexOf(punctuation) != -1) {  //found s в source;
            System.out.println("Дано число не стандартного формата ! ");
            // Determine the position of the character ','
            int p1 = source.indexOf(',');
            // Cut the first word
            first = source.substring(0, p1);
            // Cut the second word
            String second = source.substring(p1);
            // sew
            String result = first + second;
            System.out.println("result=" + result);
            System.out.println("first=" + first);
        } else {
            System.out.println("Дано число стандартного формата ! ");
            first = source;
        }
        //converts a string to number
        double number = Double.parseDouble(first);


        System.out.println("a=" + number);
        Calculator count=new Calculator(number);

        System.out.println(count.sum(2.5));

        System.out.println(count.subtraction(2.5));

        System.out.println(count.multiplication(0));

        System.out.println(count.division(2.5));

        System.out.println(count.sum(1));
        System.out.println(count.subtraction(0.5));
        System.out.println(count.division(0));

    }
}