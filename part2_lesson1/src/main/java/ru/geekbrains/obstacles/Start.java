package ru.geekbrains.obstacles;

import ru.geekbrains.interfaces.Motion;
import ru.geekbrains.interfaces.Obtacles;

public class Start implements Obtacles {

    public Start() {
        System.out.println(" Старт ");
    }

    @Override
    public void doMotion(Motion motion) {
        motion.start();
    }
}
