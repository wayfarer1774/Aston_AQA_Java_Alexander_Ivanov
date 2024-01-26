package com.Alexander.Homework;

public class Animal {
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void run(int LengthOfTheObstacle) {
        System.out.println(name + " пробежал " + LengthOfTheObstacle + " м.");
    }

    public void swim(int LengthOfTheObstacle) {
        System.out.println(name + " проплыл " + LengthOfTheObstacle + " м.");
    }
}

