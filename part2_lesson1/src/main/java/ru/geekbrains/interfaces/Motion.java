package ru.geekbrains.interfaces;

public interface Motion {
    void start();
    void run(int dist);
    void jump(int height);
    void finish();
}
