package ru.geekbrains.obstacles;

import ru.geekbrains.interfaces.Motion;
import ru.geekbrains.interfaces.Obtacles;

public class Treadmill implements Obtacles {
    int leigth;

    public Treadmill(int leigth) {
        this.leigth = leigth;
    }

    @Override
    public void Info() {
        System.out.println("===== Дистанция " + leigth + " метров =====");
    }

    @Override
    public boolean doMotion(Motion motion)  {
        if(motion.run(leigth))  return true;
        return false;
    }
}
