package ru.geekbrains;

/*
1.Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.

2.Написать простой класс Телефонный Справочник,
который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи,
а с помощью метода get() искать номер телефона по фамилии.

Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
взаимодействие с пользователем через консоль и т.д).
Консоль использовать только для вывода результатов проверки телефонного справочника.

*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static ru.geekbrains.PhoneBook.addRecord;
import static ru.geekbrains.PhoneBook.getRecords;

public class MainApp {
    public static void main(String[] args) {
        String[] words = new String[] {"One","Two","Three","Four","Five"
                                      ,"Five","Cat","Dog","One","Two"
                                      ,"Cat","Horse","Duck","Pig","One"
                                      ,"Four","Duck","Bird","Rat","Cat"};
        ArrayList<String> unic = new ArrayList<>();
        HashMap<String, Integer> unique= new HashMap<>();
        HashMap<String, Integer> counter= new HashMap<>();

        for(String word1: words){
            int count=0;
            for (String word2: words){ if(word1.equals(word2)) count++;}
            if(count == 1) {unic.add(word1); unique.put(word1, count);}
            counter.put(word1, count);
            }
        System.out.println(" 1. ======================================== ");
        System.out.println(" Уникальные слова при помощи ArrayList: "+ unic);
        System.out.println(" Уникальные слова при помощи HashMap: "+ unique);
        System.out.println(" Сколько раз встречается слово в массиве: "+ counter);
        System.out.println(" 2. ======================================== ");

        addRecord("Малахов","+79900999231");
        addRecord("Малахович","+79110001133");
        addRecord("Малахова","+79060004222");
        addRecord("Малаховский","+79503100104");
        addRecord("Малахов","+72340999230");
        addRecord("Малаховка","+795202345155");
        addRecord("Малахов","+79900864231");

    /* для ввода через консоль
        Scanner console = new Scanner(System.in);
        String surname = console.nextLine();
        getRecords(surname);
     */

        getRecords("Малахов");
    }
}
