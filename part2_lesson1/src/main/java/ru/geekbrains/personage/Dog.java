package ru.geekbrains.personage;

import ru.geekbrains.interfaces.Motion;

public class Dog implements Motion{
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run(int dist) {
        System.out.println(name + " пробежала "+ dist + " метров");
    }

    @Override
    public void jump(int height) {
        System.out.println(name + " прыгнула на "+ height + " метров");
    }

    @Override
    public void start() {
        System.out.println(name + " стартовал в гонке");
    }

    @Override
    public void finish() {
        System.out.println(name + " закончил гонку ");
    }
}
