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
                new Human("Петя",300,10),
                new Dog("Собака Лайка", 500, 15),
                new Robot("Робот Толя", 1000, 5),
                new Human("Вася",300,15),
                new Dog("Собака Дейзи", 1000, 10),
                new Robot("Робот Коля", 1000, 0),
                new Human("Иннокентий",300,15),
                new Dog("Собака Чаппа", 150, 10),
                new Robot("Робот Павлик", 1000, 15),
        };

        for(Obtacles o: obtacles) {
            if (o instanceof Start) System.out.println(" ********* Старт ********");
            else if (o instanceof Finish) System.out.println(" ********* Финиш ********* ");
            else o.Info();
            for (Motion m : motion) {
                if (!m.checkOffState()) o.doMotion(m);
            }
        }
    }
}
