package com.company;

public class RacingCar {
    //поле (field)
    private int maxSpeed;
    int weight;
    String color;
    private int currentSpeed;

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

    int getCurrentSpeed() {
        return currentSpeed;
    }

    void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            System.err.println("Некорректная скорость: <= 0");
        }
    }
}
