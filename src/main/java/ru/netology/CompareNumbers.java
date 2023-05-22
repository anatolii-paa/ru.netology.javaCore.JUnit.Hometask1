package ru.netology;

import static java.lang.Math.abs;

public class CompareNumbers {
    public static int Comparing(double number1, double number2, double eps) {
        //возвращаем 1 - если первое число больше
        //возвращаем -1 - если второе число больше
        //возвращаем 0 - если числа равны
        //double eps = 0.1; //0.00000000001;
        if (abs(number1 - number2) < eps) {
            //  if (digit1 == digit2) {
            System.out.println("Numbers is same with margin of error " + eps);
            return 0;
        } else {
            if (number1 > number2) {
                System.out.println("Number1 1 > Number2 2");
                return 1;
            } else {
                System.out.println("Number 2 > Number 1");
                return -1;
            }
        }
    }
        public static String doubleToString(double doubleNumber) {
            return String.valueOf(doubleNumber);
        }


}
