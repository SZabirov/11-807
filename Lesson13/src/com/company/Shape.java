package com.company;

public abstract class Shape {
    int x;
    int y;

    void move(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

    abstract double perimeter();

    abstract double area();
}
