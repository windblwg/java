package ru.geekbrains.interfaces;

public interface Motion {
    void start();
    boolean run(int dist);
    boolean jump(int height);
    void finish();
    boolean checkOffState();
}
