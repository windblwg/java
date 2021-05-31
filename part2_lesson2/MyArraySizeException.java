package ru.geekbrains;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(){
        System.out.println("Error: Размер массива превышен!");
    }
}
