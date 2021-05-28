package ru.geekbrains.obstacles;

import ru.geekbrains.interfaces.Motion;
import ru.geekbrains.interfaces.Obtacles;

public class Wall implements Obtacles {
    int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public void Info() {
        System.out.println("====== Стена " + heigth + " метров =====");
    }

    @Override
    public boolean doMotion(Motion motion) {
        if(motion.jump(heigth)) return true;
        return false;
    }
}
