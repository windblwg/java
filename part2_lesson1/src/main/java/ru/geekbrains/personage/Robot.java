package ru.geekbrains.personage;

import ru.geekbrains.interfaces.Motion;

public class Robot implements Motion{
    String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run(int dist) {
        System.out.println(name + " пробежал "+ dist + " метров");
    }

    @Override
    public void jump(int height) {
        System.out.println(name + " прыгнул на "+ height + " метров");
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
