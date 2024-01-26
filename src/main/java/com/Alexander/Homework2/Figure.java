package com.Alexander.Homework2;

public interface Figure {
    int length = 0;
    int width = 0;

    double square();

    default double perimeter() {
        return length * 2 + width * 2;
    }
}
