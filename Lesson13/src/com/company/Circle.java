package com.company;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    void roll() {
        System.out.println("hey, it's circle'n'roll");
    }
}
