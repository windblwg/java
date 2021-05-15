package ru.geekbrains;

/*
//1. Расширить задачу про котов и тарелки с едой.
+ 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
+ 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
+ (не упрощала) 4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
+ 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
*/

import java.util.Scanner;

public class MainApp {
    public static char c;
    public
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Plate plate = new Plate(100);

        Cat catArr[]  = new Cat []{
                new Cat("Barsik", 15),
                new Cat("Mashka", -35),
                new Cat("Mishka", 45),
                new Cat("Sima", 55),
                new Cat("Sonya", 65)
        };

        for (int i=0; i< catArr.length; i++){
            catArr[i].eat(plate);
            plate.info();
            while (catArr[i].isFull==false){
                if (doAddFood()) {
                    plate.addFood(howMuch());
                    catArr[i].eat(plate);
                    plate.info();
                }
                else break;
            }
        }
    }

    public static boolean doAddFood() {
        System.out.println(" Добавить еды? (Y-yes/N-no):");
        c = scan.next().charAt(0);
        System.out.println("----------------------------");
        return c == 'Y';
    }

    public static int howMuch() {
      System.out.println(" Сколько грамм еды добавим? :");
      int i  = scan.nextInt();
      System.out.println("----------------------------");
      return  i;
    }

}
