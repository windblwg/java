package ru.geekbrains.personage;

import ru.geekbrains.interfaces.Motion;

public class Human implements Motion {
    String name;
    int canRun;
    int canJump;
    int checkOffFlag = 0;

    public Human(String name, int canRun, int canJump) {
        this.name = name;
        this.canRun = canRun;
        this.canJump = canJump;
    }

    @Override
    public boolean run(int dist) {
        if(canRun>=dist && checkOffFlag == 0) {System.out.println(name + " пробежал "+ dist + " метров");  return true;}
        else {System.out.println(name + " сошёл с дистанции !!!!!"); checkOffFlag = 1; return false;}
    }

    @Override
    public boolean jump(int height) {
        if(canJump>=height && checkOffFlag == 0) {System.out.println(name + " прыгнул на "+ height + " метров");  return true;}
        else {System.out.println(name + " сошёл с дистанции !!!!!"); checkOffFlag = 1; return false;}
    }

    @Override
    public void start() {
        System.out.println(name + " стартовал в гонке");
    }

    @Override
    public void finish() {
        System.out.println(name + " закончил гонку ");
    }

    @Override
    public boolean checkOffState() {
        if (checkOffFlag == 1)  return true;
        return false;
    }
}
