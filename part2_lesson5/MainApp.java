package ru.geekbrains;

/*
1. Необходимо написать два метода, которые делают следующее:
1) Создают одномерный длинный массив, например:

static final int size = 10000000;
static final int h = size / 2;
float[] arr = new float[size];

2) Заполняют этот массив единицами;
3) Засекают время выполнения: long a = System.currentTimeMillis();
4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
5) Проверяется время окончания метода System.currentTimeMillis();
6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a);

Отличие первого метода от второго:
Первый просто бежит по массиву и вычисляет значения.
Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.

Пример деления одного массива на два:

System.arraycopy(arr, 0, a1, 0, h);
System.arraycopy(arr, h, a2, 0, h);

Пример обратной склейки:

System.arraycopy(a1, 0, arr, 0, h);
System.arraycopy(a2, 0, arr, h, h);

Примечание:
System.arraycopy() – копирует данные из одного массива в другой:
System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
По замерам времени:
Для первого метода надо считать время только на цикл расчета:

for (int i = 0; i < size; i++) {
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
}

 */


public class MainApp {
    static final int size = 10000000;
    static final int h = size / 2;
    private static float[] arr = new float[size];
    private static long start = 0;

    public static void main(String[] args) {
        singleThread();
        doubleThread();
    }

    public static void newArray(){
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
    }

    public static void singleThread() {
        newArray();
      //  long
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long singleTime = System.currentTimeMillis() - start;
        System.out.println(" Обработка в один поток: " + singleTime);
    }

    public static void doubleThread() {
        float[] a = new float[h];
        float[] b = new float[h];
        newArray();

        start = System.currentTimeMillis();

        System.arraycopy(arr, 0, a, 0, h);
        System.arraycopy(arr, h, b, 0, h);

        printSpeed(" Деление массива :");

        Thread aThread = new Thread(() -> {
            calc(a);
        });

        Thread bThread = new Thread(() -> {
            calc(b);
        });

        aThread.start();
        bThread.start();

       printSpeed(" Обработка в 2 потока :");

        System.arraycopy(a, 0, arr, 0, h);
        System.arraycopy(b, 0, arr, a.length, b.length);

        printSpeed(" Склейка в 2 потока :");
    }

    public static void printSpeed(String message){
        long multiTime = System.currentTimeMillis() - start;
        System.out.println( message + multiTime);
    }

    public static void calc(float[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
