package ru.geekbrains;

import javax.management.ObjectName;

public class Cat {
    public String name;
    private int appetite;
    private int defAppetite = 20;
    public boolean isFull;

    public Cat(String name, int appetite){
        this.name=name;
        if (isNullNumber(appetite)) this.appetite=appetite;
            else {
            System.out.println(" Введено не верное значение аппетита для кота " + name +", установлено значение по умолчанию "+ defAppetite);
            System.out.println("----------------------------");
            this.appetite=defAppetite;
        }
        this.isFull=false;
    }

    public void eat(Plate p){
        if (p.descFood(appetite)) {
            isFull = true;
            System.out.println(" Кот " + name + " сыт");
        }
        else {
            System.out.println(" Кот " + name + " всё ещё голоден. Добавьте еды в миску");
        }
    }

    public boolean isNullNumber(int i){
        return i>0;
    }

}
