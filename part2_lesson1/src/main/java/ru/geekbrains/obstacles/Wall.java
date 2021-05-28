package ru.geekbrains.obstacles;

import ru.geekbrains.interfaces.Motion;
import ru.geekbrains.interfaces.Obtacles;

public class Wall implements Obtacles {
    int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public void doMotion(Motion motion) {
        motion.jump(heigth);
    }
}
