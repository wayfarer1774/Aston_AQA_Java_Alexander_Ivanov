/*
Второе ДЗ.
1.  Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Огапде, Вапапа, Арр1е.
2.  Создайте метод checkSumSign(), в теле которого объявите две 1п1: переменные а иЬ, и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение "Сумма положительная" в противном случае - "Сумма отрицательная";
3.  Создайте метод printColor(), в теле которого задайте 1п1: переменную уа1ие и инициализируйте ее любым значением. Если уа1ие меньше 0 (0 включительно), то в консоль метод должен вывести сообщение "Красный", если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то "Желтый", если больше 100 (100 исключительно) - "Зеленый";
4.  Создайте метод compareNumbers(), в теле которого объявите две переменные а и Ь, и инициализируйте их любыми значениями, которыми захотите. Если а больше или равно Ь, то необходимо вывести в консоль сообщение "а > = Ь" в противном случае "а < Ь";
5.  Методы из пунктов 1-5 вызовите из метода main() и посмотрите корректно ли они работают.
 */

package com.Alexander.Lesson2Homework;

public class Homework {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 1;
        int b = 2;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 1;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
