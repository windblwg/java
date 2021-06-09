package ru.geekbrains;

public class Plate {
    private int food;
    private final int defFoodPortion = 25;
    private final int plateSize = 500;

    public Plate(int food){
        if (checkValue(food)) this.food=food;
        else {
            System.out.println(" Установлено не верное количество еды, присвоено значение по умолчанию "+plateSize);
            System.out.println("----------------------------");
            this.food=plateSize;
        }
    }

    public void addFood(int d){
        if (checkValue(d)) {
            if (food < plateSize - d) food+=d;
            else {
                System.out.println(" Нельзя положить с миску больше, чем она вмещает (500 грамм) ");
                food = plateSize;
            }
        }
        else {
            System.out.println(" Установлено не верное количество еды, присвоено значение по умолчанию "+defFoodPortion);
            System.out.println("----------------------------");
            food+=defFoodPortion;
        }
    }

    public boolean descFood(int d){
        if (food == 0 || food < d)  return false;
        else  food -= d;
        return true;
    }

    public void info(){
        System.out.println(" В тарелке "+ food + " грамм еды");
        System.out.println("----------------------------");
    }

    public boolean checkValue(int i){
        return i>0;
    }

}
