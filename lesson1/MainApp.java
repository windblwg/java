package ru.geekbrains.lesson1;

import java.util.Scanner;

public class MainApp {
    public static boolean w = true;
    public static char c;

    public static void main(String[] args) {
        do {
            getWhatWeNeedToDo();
        } while (w);
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = getNumber("a = ");
        int b = getNumber("b = ");
        a += b;
        if (a >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = getNumber("любое число:");
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = getNumber("a = ");
        int b = getNumber("b = ");
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void getWhatWeNeedToDo() {
        System.out.println("1. printThreeWords ");
        System.out.println("2. checkSumSign ");
        System.out.println("3. printColor ");
        System.out.println("4. compareNumbers");
        System.out.println("Чтоб выйти нажми любую другую клаавишу");
        c = getChar("какой метод хотим проверить?:");
        if (c == '1') {
            printThreeWords();
            System.out.println("=========================");
        } else if (c == '2') {
            checkSumSign();
            System.out.println("=========================");
        } else if (c == '3') {
            printColor();
            System.out.println("=========================");
        } else if (c == '4') {
            compareNumbers();
            System.out.println("=========================");
        } else {
            w = false;
        }
    }

    public static Integer getNumber(String a) {
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите " + a);
        i = scan.nextInt();
        return i;
    }

    public static char getChar(String a) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите " + a);
        c = scan.next().charAt(0);
        return c;
    }
}
