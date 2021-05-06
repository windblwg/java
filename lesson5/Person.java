package ru.geekbrains;

/*
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
*/

public class Person {
    private String name;
    private String surname;
    private String patronymic;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person (String name, String surname, String patronymic,String position, String email, String phone, int salary, int age){
        this.name=name;
        this.surname=surname;
        this.patronymic=patronymic;
        this.position=position;
        this.email=email;
        this.phone=phone;
        this.salary=salary;
        this.age=age;
    }

    public void printInfo(){
        System.out.println(Person.this.surname);
        System.out.println(Person.this.name);
        System.out.println(Person.this.patronymic);
        System.out.println(Person.this.position);
        System.out.println(Person.this.email);
        System.out.println(Person.this.phone);
        System.out.println(Person.this.salary);
        System.out.println(Person.this.age);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge(){
        return age;
    }

}
