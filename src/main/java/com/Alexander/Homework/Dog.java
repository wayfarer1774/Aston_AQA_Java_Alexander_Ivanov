package com.Alexander.Homework;

public class Dog extends Animal {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run(int LengthOfTheObstacle) {
        if (LengthOfTheObstacle <= 500) {
            System.out.println(name + " пробежал " + LengthOfTheObstacle + " м.");
        } else {
            System.out.println("Собаки могут пробежать не более 500 метров.");
        }
    }

    @Override
    public void swim(int LengthOfTheObstacle) {
        if (LengthOfTheObstacle <= 10) {
            System.out.println(name + " проплыл " + LengthOfTheObstacle + " м.");
        } else {
            System.out.println("Собаки могут проплыть не более 10 метров.");
        }
    }
}
