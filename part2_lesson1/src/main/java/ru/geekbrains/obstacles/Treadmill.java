package ru.geekbrains.obstacles;

import ru.geekbrains.interfaces.Motion;
import ru.geekbrains.interfaces.Obtacles;

public class Treadmill implements Obtacles {
    int leigth;

    public Treadmill(int leigth) {
        this.leigth = leigth;
    }

    @Override
    public void doMotion(Motion motion) {
        motion.run(leigth);
    }
}
