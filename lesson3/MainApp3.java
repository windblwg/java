package ru.geekbrains;

/*
+1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0;

+2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

+3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

+4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

+5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
 каждая ячейка которого равна initialValue;

+6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

+7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
**Примеры:
checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.

8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
Для усложнения задачи нельзя пользоваться вспомогательными массивами.
Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
При каком n в какую сторону сдвиг можете выбирать сами.
 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainApp3 {
    public static boolean w = true;
    public static char c;
    public static String s;
    public static int i,j,a,b,count;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            getWhatWeNeedToDo();
        } while (w);
    }

    public static void invertArray() {
        count = getNumber(" количество элементов массива = ");
        int[] arr = getRandomArray( 0, 1, count);
        System.out.println(" Before "+ Arrays.toString(arr));
        for(i=0; i<arr.length;i++)
            if (arr[i] == 0) arr[i]=1;
                        else arr[i]=0;
        System.out.println(" After  "+ Arrays.toString(arr));
    }

    public static void randomArray100() {
        int[] arr = getRandomArray(1, 100, 100);
        System.out.println(Arrays.toString(arr));
    }

    public static void multiplyIfNumLessSix() {
        count = getNumber(" количество элементов массива = ");
        int[] arr = getRandomArray( 1, 12, count);
        System.out.println(" Before "+ Arrays.toString(arr));
        for (i=0; i< arr.length; i++)
            if (arr[i] < 6) arr[i] *=2;
        System.out.println(" After  "+ Arrays.toString(arr));
    }

    public static void arrayWithDiagonalSymbolOne() {
        count = getNumber(" количество столбцов/строк массива = ");
        int[][] arr = getRandomMatrix(count);
        paintDiagonalLines(arr);
    }

    public static void initialValueArray() {
        count = getNumber(" количество элементов массива = ");
        int value = getNumber(" initialValue = ");
        int[] arr = getRandomArray(value, count);
        System.out.println(Arrays.toString(arr));
    }

    public static void getMinMaxInArray() {
        int min,max;
        count = getNumber(" количество элементов массива = ");
        int[] arr = getRandomArray( 1, 100, count);
        System.out.println(Arrays.toString(arr));
        min=max=arr[0];
        for (i=0; i<arr.length; i++)
            if(arr[i]>max)  max=arr[i];
            else if(arr[i]<min) min=arr[i];
        System.out.println("Минимальный элемент "+ min+ "/ Максимальный элемент " + max);
    }

    public static boolean checkPointOfEqualSum() {
        count = getNumber(" количество элементов массива = ");          // для перепроверки закомментировать
        int[] arr = getRandomArray( 1, 10, count);  // для перепроверки закомментировать
       // int[] arr = {1, 2, 3, 4, 5, 6, 0, 6, 5, 4, 6};                   // для перепроверки  раскомментировать
        int sum=0, point = 0;
        for (i=0; i< arr.length; i++) sum+=arr[i];
        if (sum % 2 == 0) { i=0;
            do {    point+=arr[i];
                    i++;
                } while (point==sum/2);
            return true;
        }
        else return false;
    }

    public static void сyclicShift() {
        count = getNumber(" количество элементов массива = ");
        int shift = getNumber(" сдвиг = ");
        int x, y = 0;
        int[] arr = getRandomArray(0, 10, count);
        int[] arrNew = new int[arr.length];
        System.out.println(" Before " + Arrays.toString(arr));
        if (shift >= 0){
            System.out.println(" Cдвиг массива влево на "+shift+" шагов ");
            System.arraycopy(arr, shift, arrNew, 0, arr.length - shift);
            System.arraycopy(arr, 0, arrNew, arr.length - shift, shift);
        }
        else {
            shift=-shift;
            System.out.println(" Cдвиг массива вправо на "+shift+" шагов ");
            System.arraycopy(arr, 0, arrNew, shift, arr.length - shift);
            System.arraycopy(arr, arr.length - shift, arrNew, 0, shift);
        }
        System.out.println(" After  "+ Arrays.toString(arrNew));
    }

    public static void getWhatWeNeedToDo() {
        System.out.println("=========================");
        System.out.println("1. invertArray ");
        System.out.println("2. randomArray100 ");
        System.out.println("3. multiplyIfNumLessSix ");
        System.out.println("4. arrayWithDiagonalSymbolOne");
        System.out.println("5. initialValueArray");
        System.out.println("6. getMinMaxInArray");
        System.out.println("7. checkPointOfEqualSum");
        System.out.println("8. сyclicShift");
        System.out.println("Чтоб выйти нажми любую другую клаавишу");
        c = getChar("какой метод хотим проверить?:");
        switch (c){
            case '1':  invertArray();
                break;
            case '2':  randomArray100();
                break;
            case '3': multiplyIfNumLessSix();
                break;
            case '4': arrayWithDiagonalSymbolOne();
                break;
            case '5': initialValueArray();
                break;
            case '6': getMinMaxInArray();
                break;
            case '7': if(checkPointOfEqualSum()) System.out.println(" TRUE ");
                      else System.out.println(" FALSE ");
                break;
            case '8': сyclicShift();
                break;
            default: w = false;
        }
    }

    public static Integer getNumber(String a) {
        System.out.print("Введите " + a);
        i = scan.nextInt();
        return i;
    }

    public static int[] getRandomArray(int limitNumLeft, int limitNumRight, int countArr)  {
        Random r = new Random();
        i=0;
        int[] arr=new int[countArr];
        while ( i < countArr){
                arr[i] = r.nextInt(limitNumRight-limitNumLeft+1) + limitNumLeft;
                i++;
            }
        return arr;
    }

    public static int[] getRandomArray(int value, int countArr)  {
        i=0;
        int[] arr=new int[countArr];
        while ( i < countArr){
            arr[i] =value;
            i++;
        }
        return arr;
    }

    public static int[][] getRandomMatrix(int countArr)  {
        int[][] matrix = new int[countArr][countArr];
        for (i=0; i<matrix.length; i++){
            for (j=0; j<matrix.length; i++) {
                matrix[j] = getRandomArray(2, 12, countArr);
                j++; }
         i++;
        }
        return matrix;
    }

    public static void paintDiagonalLines(int[][] arr)  {
        for (i=0; i<arr.length; i++){
            for (j=0; j<arr.length; j++)
                if (i==j || (j==arr.length-i-1)) {
                    arr[i][j] = 1;
                }
        }
        System.out.println("========================");
        printMatrix(arr);
    }

    public static void printMatrix(int[][] arr)  {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
                if (j==arr.length-1) System.out.println();
            }
        System.out.println();
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
