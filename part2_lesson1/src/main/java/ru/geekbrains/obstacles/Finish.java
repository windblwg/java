package ru.geekbrains.obstacles;

import ru.geekbrains.interfaces.Motion;
import ru.geekbrains.interfaces.Obtacles;

public class Finish implements Obtacles {
    public Finish() {
        System.out.println(" Финиш ");
    }

    @Override
    public void doMotion(Motion motion) {
        motion.finish();
    }

}
