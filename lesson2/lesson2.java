package ru.geekbrains.java1;

/*
+1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
+2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
+3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
+4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */

import java.util.Scanner;

public class lesson2 {
    public static boolean w = true;
    public static char c;
    public static String s;
    public static int i,j,a,b;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            getWhatWeNeedToDo();
        } while (w);
    }

    public static boolean isNumberSumInLimit() {
        a = getNumber("a = ");
        b = getNumber("b = ");
        return ( a+b >= 10 && a+b <=20 );
    }

    public static void isPositiveOrNegative(int i) {
        if (i>=0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean isPositiveOrNegativeBoolean(int i) {
        return (i>=0);
        }

    public static void printNStrings(String s, int j) {
        for(i=0; i<j; i++) System.out.println(s);
    }

    public static boolean isLeapYear(int i) {
        return ( i%400==0 || (i%4==0 && i%100!=0));
    }

    public static void getWhatWeNeedToDo() {
        System.out.println("=========================");
        System.out.println("1. isNumberSumInLimit ");
        System.out.println("2. isPositiveOrNegative ");
        System.out.println("3. isPositiveOrNegativeBoolean ");
        System.out.println("4. printNStrings");
        System.out.println("5. isLeapYear");
        System.out.println("Чтоб выйти нажми любую другую клаавишу");
        c = getChar("какой метод хотим проверить?:");
        switch (c){
            case '1': if (isNumberSumInLimit()) {System.out.println(" true ");}
                      else { System.out.println(" false "); };
                      break;
            case '2': i=getNumber("i = "); isPositiveOrNegative(i);
                      break;
            case '3': i=getNumber("i = ");
                      if (isPositiveOrNegativeBoolean(i)) {System.out.println(" true ");}
                      else { System.out.println(" false "); };
                      break;
            case '4': s=getString();
                      i=getNumber("сколько раз вывести = ");
                      printNStrings( s, i);
                      break;
            case '5': i=getNumber(" год = ");
                      if (isLeapYear(i)) {System.out.println(" true ");}
                      else { System.out.println(" false "); };
                      break;
            default: w = false;
        }
    }

    public static Integer getNumber(String a) {
        System.out.print("Введите " + a);
        i = scan.nextInt();
        return i;
    }

    public static char getChar(String a) {
        System.out.print("Введите " + a);
        c = scan.next().charAt(0);
        return c;
    }

    public static String getString() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку :");
        s = scan.nextLine();
        return s;
    }
}