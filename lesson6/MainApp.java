package ru.geekbrains;

/*1. Создать классы Собака и Кот с наследованием от класса Животное.
  2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
  Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
  3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
  4. * Добавить подсчет созданных котов, собак и животных.*/

import java.util.Random;
import ru.geekbrains.animals.Animal;
import ru.geekbrains.animals.Cat;
import ru.geekbrains.animals.Dog;

public class MainApp {
    public static Random rand = new Random(0);
    public static final int count = 9;
    public static Animal[] animal = new Animal[count];
    public static int cats = 0, dogs = 0, another = 0;


    public static void main(String[] args) {
            getAnimalsWithInfo(count);
    }

    public static void getAnimalsWithInfo(int count){
        for (int i = 0; i < count; i++) {
            createAnimal(i);
            System.out.println("============");
        }
        System.out.println("Котов = " + cats + ", cобак= " + dogs + ", других животных = " + another);
    }


    public static Animal createAnimal(int i) {
        String[] anyAnimal = {"Бык", "Кролик", "Конь", "Петух"};
        String[] name = {"Барсик", "Бобик", "Ричард", "Валера", "Джон"};
        int[] runDistance = {1,5,10,15,100,150,200,300,500};
        int[] swimDistance = {1,5,10,15};
        if (i % 2 == 0) {
            System.out.println("Кот: ");
            Animal animal = new Cat(name[rand.nextInt(name.length)]);
            ((Cat) animal).run(runDistance[rand.nextInt(runDistance.length)]);
            ((Cat) animal).swim(swimDistance[rand.nextInt(swimDistance.length)]);
            cats++;
        } else if (i % 3 == 0) {
            System.out.println("Пёс: ");
            Animal animal = new Dog(name[rand.nextInt(name.length)]);
            ((Dog) animal).run(runDistance[rand.nextInt(runDistance.length)]);
            ((Dog) animal).swim(swimDistance[rand.nextInt(swimDistance.length)]);
            dogs++;
        } else {
            Animal animal = new Animal(anyAnimal[rand.nextInt(anyAnimal.length)]+" "+name[rand.nextInt(name.length)]);
            animal.info();
            another++;
        }
        return animal[i];
    }
}

