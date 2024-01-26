package com.Alexander.Homework2;

public class Circle implements Figure {
    int radius;
    double pi = 3.14;
    String fillColor = "зелёный";
    String borderColor = "чёрный";

    public double square() {
        return (pi * radius * radius);
    }

    public double perimeter() {
        return (2 * pi * radius);
    }
}