package ru.geekbrains;

/*
Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).

Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
 соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.

* У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
 */

import ru.geekbrains.interfaces.Motion;
import ru.geekbrains.interfaces.Obtacles;
import ru.geekbrains.obstacles.Finish;
import ru.geekbrains.obstacles.Start;
import ru.geekbrains.obstacles.Treadmill;
import ru.geekbrains.obstacles.Wall;
import ru.geekbrains.personage.Dog;
import ru.geekbrains.personage.Human;
import ru.geekbrains.personage.Robot;

public class MainApp {
    public static void main(String[] args) {
        Obtacles[] obtacles = {
                new Start(), new Wall(5), new Treadmill(100), new Wall(10), new Treadmill(200), new Wall(15), new Finish()
        };
        Motion[] motion = {
                new Human("Человек-паук"), new Dog("Собака Лайка"), new Robot("Робот Толя")
        };

        for(Obtacles o: obtacles){
            for (Motion m: motion) {
                o.doMotion(m);
            }
        }
    }
}
