package com.Alexander.Homework;

public class Cat extends Animal {
    String name;
    boolean satiety = false;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(int LengthOfTheObstacle) {
        if (LengthOfTheObstacle <= 200) {
            System.out.println(name + " пробежал " + LengthOfTheObstacle + " м.");
        } else {
            System.out.println("Коты могут пробежать не более 200 метров.");
        }
    }

    @Override
    public void swim(int LengthOfTheObstacle) {
        if (LengthOfTheObstacle != 0) {
            System.out.println("Коты не умеют плавать.");
        }
    }

    public int eatFromDish(int foodOnThePlate, int wantedAmountOfFood) {
        if (wantedAmountOfFood > foodOnThePlate) {
            System.out.println("В миске не хватит еды");
            return foodOnThePlate;
        } else {
            foodOnThePlate = foodOnThePlate - wantedAmountOfFood;
            satiety = true;
            return foodOnThePlate;
        }
    }

    public int fullfillPlate(int foodOnThePlate, int amountAdded) {
        foodOnThePlate = foodOnThePlate + amountAdded;
        return foodOnThePlate;
    }
}