package com.Alexander.Homework2;

import static java.lang.Math.sqrt;

public class Triangle implements Figure {
    int side1, side2, side3;
    String fillColor = "жёлтый";
    String borderColor = "чёрный";

    public double square() {
        return sqrt((side1 + side2 + side3) / 2 * (side2 + side3) * (side1 + side3) * (side1 + side2));
    }

    public double perimeter() {
        return side1 + side2 + side3;
    }
}
