/*Написать класс-калькулятор, производящий суммирование, вычитание, умножение и деление денежных сумм.
Объект класса Калькулятор имеет состояние – текущее значение, над которым выполняются арифметические операции
Денежные суммы могут передаваться как в виде числовых параметров, так и в виде строк в формате xxx.xxx,dd.
Класс должен возвращать результат как в числовом виде, так и в строковом в вышеуказанном формате.
Написать тестирующий класс, проверяющий корректность работы класса*/
package com.football;
public class Main {
    public static void main(String[] args) {

        //Объект класса калькулятор имеет текущее значение
        String source = "555.555,dd";
        String s = ",";
        String first;
        if (source.indexOf(s) != -1) {  //найдено s в source;
            System.out.println("Дано число не стандартного формата ! ");
            // Определяем позицию символа ','
            int p1 = source.indexOf(',');
            // Вырезаем первое слово
            first = source.substring(0, p1);
            // Вырезаем второе слово
            String second = source.substring(p1);
            // Сшиваем все по-новому
            String result = first + second;
            System.out.println("result=" + result);
            System.out.println("first=" + first);
        } else {
            System.out.println("Дано число стандартного формата ! ");
            first = source;
        }
        //переводит строку в число
        double aInt = Double.parseDouble(first);

        // int a = (int) (aInt);
        System.out.println("a=" + aInt);
        Calculator calculator=new Calculator(aInt);

        System.out.println(calculator.sum(2.5));

        System.out.println(calculator.subtraction(2.5));

        System.out.println(calculator.multiplication(2.5));

        System.out.println(calculator.division(2.5));
    }
}