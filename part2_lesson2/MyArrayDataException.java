package ru.geekbrains;

public class MyArrayDataException extends Exception {
    public int i;
    public int j;

    public MyArrayDataException(int i, int j){
        this.i = i;
        this.j = j;
        System.out.println("Error: Формат не соответствует !");
        System.out.println("Строка : " + i + ", столбец: " + j);
    }
}
