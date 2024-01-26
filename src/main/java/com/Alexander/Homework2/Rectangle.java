package com.Alexander.Homework2;

public class Rectangle implements Figure {
    int length;
    int width;
    String fillColor = "синий";
    String borderColor = "чёрный";

    public double square() {
        return length * width;
    }

    public double perimeter() {
        return length * 2 + width * 2;
    }
}