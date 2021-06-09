package ru.geekbrains.obstacles;

import ru.geekbrains.interfaces.Motion;
import ru.geekbrains.interfaces.Obtacles;

public class Finish implements Obtacles {

    @Override
    public boolean doMotion(Motion motion)  {
        motion.finish();
        return true;
    }

    @Override
    public void Info() {
    }

}
