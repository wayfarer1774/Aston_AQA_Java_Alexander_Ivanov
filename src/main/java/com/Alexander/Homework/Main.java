package com.Alexander.Homework;

public class Main {
    public static void main(String[] args) {
        /*
        Задание 1:
        Создать классы Собака и Кот с наследованием от класса Животное.

        Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');

        У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).

        Добавить подсчет созданных котов, собак и животных.

        Расширить задачу, добавив для котов возможность кушать из миски, выполнив следующие пункты:
        Сделать так, чтобы в миске с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
        Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
        Считаем, что если коту мало еды в миске, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
        Создать массив котов и миску с едой, попросить всех котов покушать из этой миски и потом вывести информацию о сытости котов в консоль.
        Добавить метод, с помощью которого можно было бы добавлять еду в миску.
         */

        //Реализация к заданию 1. Часть 1. Создание сущностей: 1 неизвестное животное, 3 кота и 1 собака.
        //Также в блок кода включены подсчёт количества сущностей и реализация возможных действий сущностей.
        int counterAnimals = 0;
        int counterCats = 0;
        int counterDogs = 0;

        Animal animal = new Animal("животное");
        counterAnimals++;

        Cat cat = new Cat("Барсик");
        counterAnimals++;
        counterCats++;
        cat.run(200);
        cat.swim(1);

        Dog dog = new Dog("Шарик");
        counterAnimals++;
        counterDogs++;
        dog.run(500);
        dog.swim(10);

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Рыжик");
        counterAnimals++;
        counterCats++;
        cats[1] = cat;
        cats[2] = new Cat("Мурзик");
        counterAnimals++;
        counterCats++;

        System.out.println("Всего было создано " + counterAnimals + " животных. В том числе среди них котов было: " + counterCats + ", собак: " + counterDogs + "." + "\n");

        //Реализация к заданию 1. Часть 2. Кормим котов, пробуем использовать различную наполненность миски
        //и выводим состояние сытости котов.
        int plate = 30;
        plate = cats[0].eatFromDish(plate, 10);
        plate = cats[1].eatFromDish(plate, 15);
        plate = cats[2].eatFromDish(plate, 5);
        System.out.println("Миска опустошена, в ней осталось: " + plate + " еды.");

        plate = cats[0].eatFromDish(plate, 1);
        System.out.println("В миске находится: " + plate + " еды.");

        if (cats[0].satiety) {
            System.out.println("Рыжик сыт");
        } else {
            System.out.println("Рыжик голоден");
        }
        if (cats[1].satiety) {
            System.out.println("Барсик сыт");
        } else {
            System.out.println("Барсик голоден");
        }
        if (cats[2].satiety) {
            System.out.println("Мурзик сыт");
        } else {
            System.out.println("Мурзик голоден");
        }

        plate = cats[0].fullfillPlate(plate, 10);
        System.out.println("После наполнения в миске находится столько еды: " + plate);
    }
}
