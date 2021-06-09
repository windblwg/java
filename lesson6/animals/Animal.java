package ru.geekbrains.animals;

public class Animal {
    String name;

    public Animal(String name){
        this.name=name;
    }

    void run(int i){
          if(i < 0) System.out.println(" Не верное число! ");
          else System.out.println(name +" пробежал " + i +" м.");
    };

    void swim(int i){
        if(i < 0) System.out.println(" Не верное число! ");
        else System.out.println(name +" проплыл " + i +" м.");
    };

    public void info(){
        System.out.println(name);
    };
}
