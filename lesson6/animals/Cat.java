package ru.geekbrains.animals;

public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }

    @Override
    public void run(int i){
        if (i >= 200) System.out.println("Кот "+name + " не умеет так много бегать!");
        else super.run(i);
    }

    @Override
    public void swim(int i){
        System.out.println("Кот " +name + " не умеет плавать!!");
    }

}
