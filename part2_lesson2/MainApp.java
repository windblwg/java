package ru.geekbrains;

/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).

Заметка: Для преобразования строки к числу используйте статический метод класса Integer:
Integer.parseInt(сюда_подать_строку);

Заметка: Если Java не сможет преобразовать входную строку (в строке число криво написано),
то будет сгенерировано исключение NumberFormatException.
*/

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args)  {
        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"2", "3", "4", "5"}, {"3", "4", "5", "6"}, {"0", "5", "6", "7"}}; //normal
    //    String[][] arr = new String[][]{{"1", "2", "3", "4", "0"}, {"2", "3", "4", "5"}, {"3", "4", "5", "6"}, {"4", "5", "6", "A"}}; //incorrectSize
    //    String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"2", "3", "4", "5"}, {"3", "4", "5", "6"}, {"4", "5", "6", "A"}}; //incorrect Data
    //    String[][] arr = new String[][]{{"1", "2", "3", "4", "0"}, {"2", "3", "4", "5"}, {"3", "4", "5", "6"}, {"4", "5", "6", "A"}};//incorrectSize&Data
        try {
            try {
                int result = sumData(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {}
        }
        catch (MyArrayDataException e) {}
    }

    public static int sumData(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
}

