package ru.geekbrains;
/*
+ 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

+ 2. Конструктор класса должен заполнять эти поля при создании объекта.

+3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

+4. Создать массив из 5 сотрудников.
        Пример:
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person(...);
        ...
        persArray[4] = new Person(...);

+5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
*/

import java.util.Random;

public class MainApp5 {
    public static Random rand = new Random();
    public static final int count=5;
    public static Person[] persone = new Person[count];

    public static void main(String[] args) {
        createPersons(count);
        isPersonUp40();
    }

    public static void createPersons(int count){

        for(int i=0; i< count; i++) {
            persone[i] = randomInfo();
            System.out.println("============");
            persone[i].printInfo();
        }
    }

    public static void isPersonUp40(){
        System.out.println(" == Сотрудники старше 40 лет ==");
        for(int i=0; i<count; i++)
            if(persone[i].getAge()>=40) {
                System.out.println("============");
                persone[i].printInfo();
            }
    }

    public static Person randomInfo(){
        Person person = new Person(null,null,null,null,null,null,0,0);
        String[] name = {"Иван","Дмитрий","Кирилл","Антон","Денис"};
        String[] surname = {"Иванов","Петров","Сидоров","Магомедов"};
        String[] patronymic = {"Иванович", "Петрович", "Антонович"};
        String[] position = {"Engineer","QA Tester","Arch","Manager"};
        String[] email = {"iv1@box.com","iv2@box.com","iv3@box.com","iv4@box.com","iv5@box.com"};
        String[] phone = {"79997774411","79997774412","79997774413","79997774414","79997774415"};
        int[] salary = {30000,50000,24500,13900,35700};
        int[] age = {30,41,44,48,45};

        person.setName(name[rand.nextInt(name.length)]);
        person.setSurname(surname[rand.nextInt(surname.length)]);
        person.setPatronymic(patronymic[rand.nextInt(patronymic.length)]);
        person.setPosition(position[rand.nextInt(position.length)]);
        person.setEmail(email[rand.nextInt(email.length)]);
        person.setPhone(phone[rand.nextInt(phone.length)]);
        person.setSalary(salary[rand.nextInt(salary.length)]);
        person.setAge( age[rand.nextInt(age.length)]);
        
        return person;
    }
}
