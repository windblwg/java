package ru.geekbrains.obstacles;

import ru.geekbrains.interfaces.Motion;
import ru.geekbrains.interfaces.Obtacles;

public class Start implements Obtacles {

    @Override
    public boolean doMotion(Motion motion)  {
        motion.start();
        return true;
    }

    @Override
    public void Info() {
    }
}
