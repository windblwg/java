package ru.geekbrains.animals;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void run(int i){
        if (i >= 500) System.out.println("Пёс "+name + " не умеет так много бегать!");
        else super.run(i);
    }

    @Override
    public  void swim(int i){
        if (i > 10) System.out.println("Пёс "+ name + " не умеет так далеко плавать!");
        else super.swim(i);
    }
}
