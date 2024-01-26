package com.Alexander.Homework2;

public class Main {
    public static void main(String[] args) {
        /*
        Задание 2:
        Применяя интерфейсы написать программу расчета периметра и площади геометрических фигур: круг, прямоугольник, треугольник.
        Задать для каждой фигуры цвет заливки и цвет границы.
        Результат полученных характеристик [ Периметр, площадь, цвет фона, цвет границ ] по каждой фигуре вывести в консоль.
        Попробуйте реализовать базовые методы, такие как расчет периметра фигур, в качестве дефолтных методов в интерфейсе.
         */

        //круг
        Circle circle = new Circle();
        circle.radius = 3;
        System.out.println("Площадь круга: " + circle.square() + ". Его периметр: " + circle.perimeter() + ". Его цвет фона: " + circle.fillColor + ". Его цвет границ: " + circle.borderColor + ".\n");

        //прямоугольник
        Rectangle rectangle = new Rectangle();
        rectangle.length = 3;
        rectangle.width = 4;
        System.out.println("Площадь прямоугольника: " + rectangle.square() + ". Его периметр: " + rectangle.perimeter() + ". Его цвет фона: " + rectangle.fillColor + ". Его цвет границ: " + rectangle.borderColor + ".\n");

        //треугольник
        Triangle triangle = new Triangle();
        triangle.side1 = 3;
        triangle.side2 = 4;
        triangle.side3 = 5;
        System.out.println("Площадь треугольника: " + triangle.square() + ". Его периметр: " + triangle.perimeter() + ". Его цвет фона: " + triangle.fillColor + ". Его цвет границ: " + triangle.borderColor + ".\n");
    }
}
