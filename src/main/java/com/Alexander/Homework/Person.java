package com.Alexander.Homework;

//1-е задание
/*
Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
*/
public class Person {
    private String fio;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Person(String fio, String position, String email, String phoneNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }


    public String getPosition() {
        return position;
    }


    public String getEmail() {
        return email;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public int getSalary() {
        return salary;
    }


    public int getAge() {
        return age;
    }

    public void toOutput() {
        System.out.println("ФИО сотрудника: " + getFio() + ". Данный сотрудник имеет должность: \"" + getPosition() + "\". Его email: " + getEmail() + ". Его контактный телефон: " + getPhoneNumber() + ". Его заработная плата: " + getSalary() + " рублей. Его возраст: " + getAge() + " лет.");
    }
}