package com.Alexander.Homework;

//1-е задание
/*
Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
*/
public class Person {
    String fio;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Person(String fio, String position, String email, String phoneNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void toOutput() {
        System.out.println("ФИО сотрудника: " + fio + ". Данный сотрудник имеет должность: \"" + position + "\". Его email: " + email + ". Его контактный телефон: " + phoneNumber + ". Его заработная плата: " + salary + " рублей. Его возраст: " + age + " лет.");
    }
}