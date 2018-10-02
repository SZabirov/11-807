package com.company;

public class RacingCar {
    //поле (field)
    int maxSpeed;
    int weight;
    String color;
    int currentSpeed;


    RacingCar(String color, int maxSpeed, int weight) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    RacingCar(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    //method
    void accelerate(int kmH) {
        if (currentSpeed + kmH < maxSpeed) {
            currentSpeed += kmH;
        } else {
            System.err.println("Too much");
        }
    }
}
